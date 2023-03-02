package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		product1.name = "Coffe Machine";
		product1.unitPrice = 18000.00;
		product1.unitInStock = 50;
		product1.discount = 2.00;
		product1.imageUrl = "image.jpg";

		product2.name = "Laptop";
		product2.unitPrice = 25000.00;
		product2.unitInStock = 10;
		product2.discount = 8.00;
		product2.imageUrl = "laptop.jpg";

		product3.name = "Rtx3060";
		product3.unitPrice = 9000.00;
		product3.unitInStock = 30;
		product3.discount = 0;
		product3.imageUrl = "gpu.jpg";

		// System.out.println(product.name);
		
		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.name + "\n" + product.unitPrice + "\n" + product.unitInStock + "\n"
					+ product.discount + "\n" + product.imageUrl + "\n*************");
		}

	}
}
