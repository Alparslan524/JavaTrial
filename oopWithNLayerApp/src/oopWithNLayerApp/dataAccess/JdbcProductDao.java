package oopWithNLayerApp.dataAccess;

import oopWithNLayerApp.entities.Product;

public class JdbcProductDao implements ProductDao {

	public void add(Product product) {
		System.err.println(product.getName() + " added to Database with JDBC ");
	}

}
