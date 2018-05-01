package tech.swoven.subject;

import tech.swoven.observers.Observer;

public interface Stocks {
	
	void attach(Observer observer);
	void detach(Observer observer);
	void notifyObservers();
	
}
