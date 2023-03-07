
public class Main {

	public static void main(String[] args) {

		CustomerManager customerManager = new CustomerManager(new MsSqlCustomerDal());
		CustomerManager customerManager2 = new CustomerManager(new OracleCustomerDal());
		customerManager.add();
		customerManager2.add();
	}

}
