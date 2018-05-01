package tech.swoven.observers;

import tech.swoven.subject.AppleStock;

public class AppleStockWatcherTwo implements Observer{

	@Override
	public void update(AppleStock sub) {
		System.out.println(this.getClass().getName()+ ": New Apple stock price is : "+ sub.getCurrentPrice());
	}

}
