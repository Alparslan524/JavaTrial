package oopWithNLayerApp.business;

import java.util.ArrayList;
import java.util.List;

import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.dataAccess.ProductDao;
import oopWithNLayerApp.entities.Product;

public class ProductManager {

	private ProductDao productDao;
	private Logger[] loggers;
	private List<Product> products= new ArrayList<>();
	
	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers=loggers;
	}

	public void add(Product product) throws Exception {
		
		for (Product productList : products) {
			if (productList.getName()==product.getName()) {
				throw new Exception("Product name already exist " + product.getName());
			}
		}
		
		if (product.getUnitPrice() < 10) {
			throw new Exception("Product price cannot be a less 10");
		}
		products.add(product);
		productDao.add(product);
		
		for (Logger logger : loggers) {
			logger.log(product.getName());
		}
		
	}

}
