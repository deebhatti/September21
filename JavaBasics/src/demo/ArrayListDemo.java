package demo;

import java.util.ArrayList;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("Tokyo");
		cities.add("New York");
		cities.add("New Delhi");
		
		for (String x : cities){
			System.out.println(x);
		}
		
		System.out.println("Index of Tokyo = " + cities.indexOf("Tokyo"));
		
		System.out.println("Value at index 3 = " + cities.get(3));
		
		System.out.println("Total values inside the arraylist = " + cities.size());
		
		
		
		
	}

}
