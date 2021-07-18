package assignment2;


public class TestCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customer1 = new Customer("do","Andrew","Gold");
		Customer customer2 = new Customer("co","Andrew","Gold");
		
		
		
		System.out.println(customer1.getCustNo() + "\t" + customer1.getCustName() + "\t" + customer1.getCategory());
		System.out.println(customer2.getCustNo() + "\t" + customer2.getCustName() + "\t" + customer2.getCategory());

	}

}
