package assignment3;

public class TravelCard extends PrepaidCard implements Rewardable{
	private int rewardPoints = 0;
	
	public int calculateRewardPoints(int amount) {
		this.rewardPoints = amount/20;
		return this.rewardPoints;
		
	}
	
	public boolean swipeCard(int amount) {
		if(amount > getSwipeLimit() || amount > getAvailableBalance()) {
			return false;
		}
		setAvailableBalance(getAvailableBalance()-amount-amount*0.05);
		return true;
	}
	
}
