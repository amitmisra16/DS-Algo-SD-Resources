package gtci.two.pointers;

// Assumptions
// The array is sorted
// input sum is an integer
// find a pair whose sum is equal to the input
// return (-1,-1) if pair is not found
public class I00PairWithTargetSum {
    public int[] findPair(int[] input, int targetSum) {
        int[] pair = {-1,-1};
        int startIndex = 0;
        int endIndex = input.length - 1;
        while (startIndex <= endIndex) {
            int leftValue = input[startIndex];
            int rightValue = input[endIndex];
            if (leftValue + rightValue > targetSum ) {
                endIndex -= 1;
            } else if ( leftValue + rightValue < targetSum) {
                startIndex += 1;
            } else {
                pair[0] = startIndex;
                pair[1] = endIndex;
                break;
            }
        }
        return pair;
    }

    public static void main(String[] args) {
        int[] input = {1,2,3,4,6};
        int target = 6;
        I00PairWithTargetSum targetSum = new I00PairWithTargetSum();
        int[] pair = targetSum.findPair(input, target);
        System.out.printf("pair = (%d, %d)\n", pair[0], pair[1]);

        input = new int[]{1, 2, 3, 4, 5, 6};
        pair = targetSum.findPair(input, target);
        System.out.printf("pair = (%d, %d)\n", pair[0], pair[1]);
    }
}
