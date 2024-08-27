package gtci.sliding.window;

public class E08LongestSubArrayOfOnesAfterKReplacement {

    public int compute(int k, int[] input) {
        int maxOnesCount = 0, windowStart = 0, maxLength = 0;
        for (int windowEnd = 0; windowEnd < input.length; windowEnd++) {
            if (input[windowEnd] == 1) {
                maxOnesCount ++;
            }
            if (windowEnd - windowStart + 1 - maxOnesCount > k) {
                if (input[windowStart++] == 1) {
                    maxOnesCount--;
                }
            }
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
