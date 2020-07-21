package application;

import java.util.Comparator;

import entities.Product;

public class MyComparator implements Comparator<Product> {

	@Override
	public int compare(Product other1, Product other2) {	
		return other1.getName().toUpperCase().compareTo(other2.getName().toUpperCase());
	}

	

}
