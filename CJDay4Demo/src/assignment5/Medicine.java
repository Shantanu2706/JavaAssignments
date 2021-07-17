package assignment5;

public abstract class Medicine {
	private int price;
	private String expiryDate;
	
	public void getDetails() {
		System.out.println("Price: " + this.price + " Expiry Date: " + this.expiryDate);
	}
	
	public abstract void displayLabel();

}
