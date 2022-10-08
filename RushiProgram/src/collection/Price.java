package collection;

import java.util.Comparator;

public class Price implements Comparator<Item> {

	@Override
	public int compare(Item o1, Item o2) {
		return o2.price.compareTo(o1.price);
	}

}
