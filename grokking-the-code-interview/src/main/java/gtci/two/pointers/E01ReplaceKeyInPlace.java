package gtci.two.pointers;

import java.util.Arrays;

public class E01ReplaceKeyInPlace {

    public static int replaceKey(int key, int[] input) {
        int nextElement = 0;
        for (int i = 0 ; i < input.length; i++) {
            if(input[i] != key) {
                input[nextElement++] = input[i];
            }
        }
        return nextElement;
    }

    public static void main(String[] args) {
        int[] input = new int[]{3, 2, 3, 6, 3, 10, 9, 3};
        System.out.println(replaceKey(3, input));
//        Arrays.stream(input).boxed().forEach(System.out::println);
        input = new int[]{2,11,2,2,1};
        System.out.println(replaceKey(2, input));
        Arrays.stream(input).boxed().forEach(System.out::println);
    }
}
