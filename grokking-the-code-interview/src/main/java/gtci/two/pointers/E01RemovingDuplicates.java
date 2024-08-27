package gtci.two.pointers;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class E01RemovingDuplicates {
    public int removeDuplicates(int[] input) {
        int uniquePointer = 0;
        int traversalPointer = 0;

        while (traversalPointer < input.length) {
            if (input[uniquePointer] == input[traversalPointer]) {
                traversalPointer += 1;
            } else {
                input[++uniquePointer] = input[traversalPointer++];
            }
        }
        return uniquePointer + 1;
    }

    public static void main(String[] args) {
        int[] input = new int[] {2,3,3,3,6,9,9};
        E01RemovingDuplicates removingDuplicates = new E01RemovingDuplicates();
        System.out.println("array length = " + removingDuplicates.removeDuplicates(input));
        Arrays.stream(input).boxed().collect(Collectors.toList()).forEach(System.out::println);
        input = new int[] {2,2,2,11};
        System.out.println("array length = " + removingDuplicates.removeDuplicates(input));
        Arrays.stream(input).boxed().collect(Collectors.toList()).forEach(System.out::println);
    }
}
