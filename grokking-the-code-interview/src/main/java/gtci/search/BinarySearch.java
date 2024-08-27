package gtci.search;

import java.util.*;

public class BinarySearch {

public static void main(String args[]) {
	Integer[] input = {1,2,3,4,5,6,7,8,9,10};

	Integer search = Integer.parseInt(args[0]);

	// Assuming the input list is already sorted, apply binary search
	
	Integer mid = input.length/2;
	Boolean found = false;
	while (mid > 0 || mid < input.length) {
		if (input[mid] > search) {
			mid = mid/2;
		} else if (input[mid] < search) {
			mid += mid/2;
		} else {
			found = true;
			break;
		}
	}
	if (found) {
		System.out.printf("Found the search element at %d position in the list", mid+1);

	} else {
		System.out.println("Could not find the element in the list");
	}
}
}
