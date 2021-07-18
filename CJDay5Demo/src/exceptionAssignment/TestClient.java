package exceptionAssignment;

public class TestClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order order1 = new Order(10,"Joey",1000,"CoD");
		Order order2 = new Order(20,"Ross",2000,"Gift Card");
		Order order3 = new Order(30,"Sheldon",10,"CoD");
		
		try {
			OrderServiceUtil.addOrder(order1);
			OrderServiceUtil.addOrder(order2);
			OrderServiceUtil.addOrder(order3);
			System.out.println(OrderServiceUtil.searchOrder(10).getCustomerName());
			System.out.println(OrderServiceUtil.searchOrder(20).getCustomerName());
			System.out.println(OrderServiceUtil.searchOrder(30).getCustomerName());
		}catch(Exception e) {
			
		}finally {
			System.out.println(OrderServiceUtil.findTotal());
		}
		
		
		
		
	}

}
