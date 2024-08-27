package gtci.sliding.window;

import java.util.List;

public class E02SmallestSubArrayForGivenSizeMaxTotal {

    public int compute(List<Integer> input, int TOTAL) {
        int minimumLength = Integer.MAX_VALUE;
        int currentSum = 0;
        int currentLength = 0;
        for (int startIndex = 0; startIndex < input.size(); startIndex++) {
            currentSum += input.get(startIndex);
            currentLength++;
            if (currentSum >= TOTAL) {
                if (minimumLength > currentLength) {
                    minimumLength = currentLength;
                }
                startIndex = startIndex - currentLength + 1;
                currentSum = 0;
                currentLength = 0;
            }
        }
        return minimumLength;
    }

    public int computeV2(List<Integer> input, int MAX_SIZE) {
        int maxTotal = Integer.MIN_VALUE;
        int currentSubArrayLength = 0, currentSubArrayTotal = 0, windowStart = 0;
        for (int windowEnd = 0 ; windowEnd < input.size(); windowEnd ++) {
            currentSubArrayTotal += input.get(windowEnd);
            currentSubArrayLength += 1;
            while (currentSubArrayLength > MAX_SIZE) {
                currentSubArrayTotal -= input.get(windowStart++);
                currentSubArrayLength -= 1;
            }
            maxTotal = Math.max(maxTotal, currentSubArrayTotal);
        }
        return maxTotal;
    }

    public int computeV3(int[] input, int MAX_SUM) {
        int MIN_SUB_ARRAY_LENGTH = Integer.MAX_VALUE;
        int currentSubArrayTotal = 0, currentSubArraySize = 0, windowStart = 0;
        for (int windowEnd = 0 ; windowEnd < input.length; windowEnd++) {
            currentSubArrayTotal += input[windowEnd];
            while (currentSubArrayTotal >= MAX_SUM) {
                MIN_SUB_ARRAY_LENGTH = Math.min(MIN_SUB_ARRAY_LENGTH, windowEnd - windowStart + 1);
                currentSubArrayTotal -= input[windowStart++];
            }
        }
        return MIN_SUB_ARRAY_LENGTH == Integer.MAX_VALUE ? 0 : MIN_SUB_ARRAY_LENGTH;
    }
}
