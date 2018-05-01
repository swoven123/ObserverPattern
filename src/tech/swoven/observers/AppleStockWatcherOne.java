package tech.swoven.observers;

import tech.swoven.subject.AppleStock;

public class AppleStockWatcherOne implements Observer{
	
	private int currentStockPrice;
	
	@Override
	public void update(AppleStock sub) {
		currentStockPrice = sub.getCurrentPrice();
		System.out.println(this.getClass().getName() + " New Apple Price is:  "+ currentStockPrice);
	}
	

}
