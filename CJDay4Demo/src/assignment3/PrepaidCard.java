package assignment3;

public abstract class PrepaidCard {
	private int cardNo;
	private double availableBalance;
	private double swipeLimit;
	
	
	public abstract boolean swipeCard(int amount);
	
	@Override
	public String toString() {
		return ("Card No: " + this.cardNo + " Available Balance: " + 
				this.availableBalance + " Swipe Limit: " + this.swipeLimit);
	}
	
	public void rechargeCard(int amount) {
		this.availableBalance += amount;
	}

	public int getCardNo() {
		return cardNo;
	}

	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double availableBalance) {
		this.availableBalance = availableBalance;
	}

	public double getSwipeLimit() {
		return swipeLimit;
	}

	public void setSwipeLimit(double swipeLimit) {
		this.swipeLimit = swipeLimit;
	}
	
	
	

}
