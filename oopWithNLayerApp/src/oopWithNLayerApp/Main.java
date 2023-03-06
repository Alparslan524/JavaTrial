package oopWithNLayerApp;

import oopWithNLayerApp.business.ProductManager;
import oopWithNLayerApp.core.logging.DatabaseLogger;
import oopWithNLayerApp.core.logging.FileLogger;
import oopWithNLayerApp.core.logging.Logger;
import oopWithNLayerApp.core.logging.MailLogger;
import oopWithNLayerApp.dataAccess.HibernateProductDao;
import oopWithNLayerApp.dataAccess.JdbcProductDao;
import oopWithNLayerApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {

		Product product1 = new Product(1, "Poco M3", 5000);
		Product product2 = new Product(2, "Poco M3", 500);
		
		// Logger[] loggers = { new MailLogger(), new DatabaseLogger() };
		Logger[] loggers = { new MailLogger(), new DatabaseLogger(), new FileLogger() };
		// İstediğin kadar log türü gönder

		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);
		//productManager.add(product2);//Product name already exist

	}

}
