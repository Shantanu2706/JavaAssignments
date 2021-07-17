package assignment3;

public class TestCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TravelCard card = new TravelCard();
		card.setCardNo(10);
		card.setAvailableBalance(500);
		card.setSwipeLimit(199.0);
		int amount = 100;
		int points = 0;
		if(card.swipeCard(amount)) {
			System.out.println("Swipe successful");
			points = card.calculateRewardPoints(amount);
		}else {
			System.out.println("Swipe failed");
		}
		System.out.println("Balance: " + card.getAvailableBalance() + " Reward Points: " + points);
		
		amount = 200;
		if(card.swipeCard(amount)) {
			System.out.println("Swipe successful");
			points = card.calculateRewardPoints(amount);
		}else {
			System.out.println("Swipe failed");
		}
		System.out.println("Balance: " + card.getAvailableBalance() + " Reward Points: " + points);
		

	}

}
