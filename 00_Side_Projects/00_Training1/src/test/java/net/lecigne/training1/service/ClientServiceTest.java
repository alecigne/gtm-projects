package net.lecigne.training1.service;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import net.lecigne.training1.dao.ManualClientDao;
import net.lecigne.training1.exceptions.ServiceException;
import net.lecigne.training1.model.Client;

public class ClientServiceTest {
	
	@Mock
	ManualClientDao dao;
	private ClientServiceImpManual s;
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		s = new ClientServiceImpManual();
		s.setClientDao(dao);
	}

	@Test(expected = ServiceException.class)
	public void sauvegarderClient_Should_Throw_ServiceException_When_Null_Client() throws ServiceException {
		s.sauvegarderClient(null);
	}
	
	@Test(expected = ServiceException.class)
	public void sauvegarderClient_Should_Throw_ServiceException_When_No_Name() throws ServiceException {
		s.sauvegarderClient(new Client("", "Michel"));
	}
	
	@Test(expected = ServiceException.class)
	public void sauvegarderClient_Should_Throw_ServiceException_When_No_Firstname() throws ServiceException {
		s.sauvegarderClient(new Client("Dupont", ""));
	}
	
	@Test(expected = ServiceException.class)
	public void sauvegarderClient_Should_Throw_ServiceException_When_Name_Is_Null() throws ServiceException {
		s.sauvegarderClient(new Client(null, "Michel"));
	}
	
	@Test(expected = ServiceException.class)
	public void sauvegarderClient_Should_Throw_ServiceException_When_Firstname_Is_Null() throws ServiceException {
		s.sauvegarderClient(new Client("Dupont", null));
	}
	
}
