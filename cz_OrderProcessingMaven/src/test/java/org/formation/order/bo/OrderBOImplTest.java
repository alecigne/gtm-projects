package org.formation.order.bo;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.sql.SQLException;

import org.formation.order.dao.OrderDAO;
import org.formation.order.dto.Order;
import org.formation.order.exception.BOException;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class OrderBOImplTest {

	private static final int ORDER_ID = 123;
	@Mock
	OrderDAO dao;
	private OrderBOImpl bo;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		bo = new OrderBOImpl();
		bo.setDao(dao);
	}

	@Test
	public void placeOrder_Should_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenReturn(1);
		boolean result = bo.placeOrder(order);
		assertTrue(result);
		verify(dao).create(order); // atLeast(1) & co -> cf.
	}

	@Test
	public void placeOrder_Should_not_Create_An_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.create(order)).thenReturn(0);
		boolean result = bo.placeOrder(order);
		assertFalse(result);
		verify(dao).create(order);
	}

	@Test
	public void cancelOrder_Should_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(anyInt())).thenReturn(order);
		when(dao.update(order)).thenReturn(1);
		boolean result = bo.cancelOrder(ORDER_ID);
		assertTrue(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
	}

	@Test
	public void cancelOrder_Should_Not_Cancel_The_Order() throws SQLException, BOException {
		Order order = new Order();
		when(dao.read(ORDER_ID)).thenReturn(order);
		when(dao.update(order)).thenReturn(0);
		boolean result = bo.cancelOrder(ORDER_ID); // Attention à bien utiliser la même valeur
		assertFalse(result);
		verify(dao).read(ORDER_ID);
		verify(dao).update(order);
	}

	@Test
	public void deleteOrder_Deletes_The_Order() throws SQLException, BOException {
		when(dao.delete(ORDER_ID)).thenReturn(1);
		boolean result = bo.deleteOrder(ORDER_ID);
		assertTrue(result);
		verify(dao).delete(ORDER_ID);
	}

	@Test(expected = BOException.class)
	public void cancelOrder_Should_Throw_a_BOException_On_Read() throws SQLException, BOException {
		when(dao.read(anyInt())).thenThrow(SQLException.class);
		bo.cancelOrder(ORDER_ID);
//		verify(dao).read(ORDER_ID); // Inutile
	}

}
