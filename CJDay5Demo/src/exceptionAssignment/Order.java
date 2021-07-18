package exceptionAssignment;

public class Order {
	private int orderId;
	private String customerName;
	private float orderAmount;
	private String paymentOption;
	
	public Order(int orderId, String customerName, float orderAmount, String paymentOption) {
		if(orderAmount < 100 || (!paymentOption.equals("CoD") && !paymentOption.equals("Gift Card") && !paymentOption.equals("Internet Banking"))) {
			try {
				throw new MyException();
			}catch(MyException exp) {
				System.out.println(exp);
			}
			
		}else {
			this.orderId = orderId;
			this.customerName = customerName;
			this.orderAmount = orderAmount;
			this.paymentOption = paymentOption;
		}
		
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getCustomerName() {
		if(customerName == null) {
			return "Invalid";
		}
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public float getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(String paymentOption) {
		this.paymentOption = paymentOption;
	}
	
	
}
