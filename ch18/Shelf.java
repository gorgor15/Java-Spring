package ch18;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf() {
		shelf = new ArrayList<String>();
	}

	public ArrayList<String> getShelf() {
		return shelf;
	}

	public int getCount() {
		return shelf.size();
	}

	public String deQueue() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
