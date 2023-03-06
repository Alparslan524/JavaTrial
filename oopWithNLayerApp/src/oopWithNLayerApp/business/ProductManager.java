package oopWithNLayerApp.business;

import java.util.List;

import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {

		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price cannot be a less 10");
		}
		
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}

}
