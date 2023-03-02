package oop1;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product();
		Product product2 = new Product();
		Product product3 = new Product();

		product1.setName("Coffe Machine");
		product1.setUnitPrice(18000.00);
		product1.setUnitInStock(50);
		product1.setDiscount(2.00);
		product1.setImageUrl("image.jpg");

		product2.setName("Laptop");
		product2.setUnitPrice(25000.00);
		product2.setUnitInStock(30);
		product2.setDiscount(7.00);
		product2.setImageUrl("laptop.jpg");

		product3.setName("Rtx3060");
		product3.setUnitPrice(9000.00);
		product3.setUnitInStock(10);
		product3.setDiscount(0);
		product3.setImageUrl("gpu.jpg");

		// System.out.println(product.name);

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName() + "\n" + product.getUnitPrice() + "\n" + product.getUnitInStock()
					+ "\n" + product.getDiscount() + "\n" + product.getImageUrl() + "\n*************");
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(0);
		individualCustomer.setCustomerNumber("1");
		individualCustomer.setPhone("543");
		individualCustomer.setFirstName("Alparslan");
		individualCustomer.setLastName("Aydoğan");
		individualCustomer.setIdentityNumber("66");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(0);
		corporateCustomer.setCustomerNumber("1");
		corporateCustomer.setPhone("544");
		corporateCustomer.setCompanyName("KİTA");
		corporateCustomer.setTaxNumber("545");

		Customer[] customers = { individualCustomer, corporateCustomer };

		for (Customer customer : customers) {
			System.out.println(customer.getId() + "\n" + customer.getCustomerNumber() + "\n" + customer.getPhone()+
			"\n******************");
		}

	}
}
