package tech.swoven.subject;

import java.util.ArrayList;
import java.util.List;

import tech.swoven.observers.Observer;

public class AppleStock implements Stocks{
	
	private int currentPrice;
	
	private List<Observer> listOfObserver;
	
	public AppleStock(int stockPrice) {
		listOfObserver = new ArrayList<>();
		this.currentPrice = stockPrice;
	}
	
	@Override
	public void attach(Observer observer) {
		listOfObserver.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		listOfObserver.remove(observer);
	}

	@Override
	public void notifyObservers() {
		for(Observer observer: listOfObserver)
			observer.update(this);
	}

	public int getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(int currentPrice) {
		this.currentPrice = currentPrice;
		notifyObservers();
	}
	
	
	
	
}
