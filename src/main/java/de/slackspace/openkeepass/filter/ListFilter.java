package de.slackspace.openkeepass.filter;

import java.util.ArrayList;
import java.util.List;

public class ListFilter {

	public static <T> List<T> filter(List<T> items, Filter<T> filter) {
		List<T> filteredList = new ArrayList<T>();
		
		for (T item : items) {
			
			if(filter.matches(item)) {
				filteredList.add(item);
			}
		}
		
		return filteredList;
	}
	
	
}
