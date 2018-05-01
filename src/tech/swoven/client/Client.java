package tech.swoven.client;

import tech.swoven.observers.AppleStockWatcherOne;
import tech.swoven.observers.AppleStockWatcherTwo;
import tech.swoven.subject.AppleStock;

public class Client {
	
	public static void main(String[] args) {
		AppleStock stock = new AppleStock(100);
		AppleStockWatcherOne one = new AppleStockWatcherOne();
		AppleStockWatcherTwo two = new AppleStockWatcherTwo();
		
		stock.attach(one);
		stock.attach(two);
		
		stock.setCurrentPrice(500);
		
	}

}
