package tech.swoven.observers;

import tech.swoven.subject.AppleStock;

public interface Observer {
	void update(AppleStock sub);
}
