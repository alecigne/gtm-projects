package org.formation.ws.jaxrs;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {

	List<Product> products = new ArrayList<Product>();
	private int productId = 123;

	public ProductServiceImpl() {
		Product product = new Product();
		product.setId(++productId);
		product.setDescription("Cool Product");
		products.add(product);
	}

	@Override
	public List<Product> getProducts() {
		System.out.println("getProducts");
		return this.products;
	}

	@Override
	public int addProduct(Product product) {
		System.out.println("addProduct");
		product.setId(++productId);
		products.add(product);
		return productId;
	}

}
