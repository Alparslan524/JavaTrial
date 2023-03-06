package oopWithNLayerApp.business;

import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;

	public ProductManager(ProductDao productDao) {
		this.productDao = productDao;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price cannot be a less 10");
		}
		productDao.add(product);
	}

}
