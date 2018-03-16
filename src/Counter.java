
/**
 * A simple counter.
 */

public class Counter extends java.util.Observable  {
	private int count;
	
	public Counter() {
		this.count = 0;
	}
	
	public void add(int howmuch) {
		count += howmuch;
		setChanged();
		notifyObservers();
	}
	
	public int getCount() {
		return count;
	}
}
