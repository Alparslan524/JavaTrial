package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class HibernateProductDao implements ProductDao{

	public void add(Product product) {
		System.err.println(product.getName() + " added to Database with Hibernate");
	}
}
