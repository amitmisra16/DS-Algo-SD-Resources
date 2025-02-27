package gtci.sliding.window;

import java.util.ArrayList;
import java.util.List;

public class E01AverageOfSubArrays {
    public List<Float> compute(int arr[], int subArraySize) {
        // calculate the sum of first subArraySize elements
        float sum = 0;
        List<Float> averages = new ArrayList<>();
        for (int i = 0 ; i < subArraySize; i++) {
            sum += arr[i];
        }
//        System.out.println("elements: {" + subArrayElements + "} average = " + sum/subArraySize);
        averages.add(sum/subArraySize);
        // print the average

        // iterate over the next arr[].length - subArraySize
        // by replacing the first element with the next end element in the previous sum
        // using the new sum print the average
        for (int i = subArraySize ; i < arr.length ; i ++) {
            sum = (sum - arr[i - subArraySize]) + arr[i];
//            System.out.println("elements: {" + subArrayElements + "} average = " + sum/subArraySize);
            averages.add(sum/subArraySize);
        }
        return averages;
    }

    public List<Float> computeV2(int arr[], int subArraySize) {
        // calculate the sum of first subArraySize elements
        float sum = 0;
        List<Float> averages = new ArrayList<>();
        for (int i = 0 ; i < arr.length; i++) {
            sum += arr[i];
            // Sliding starts from here ...
            if ( i >= subArraySize - 1) {
                // print the average

                // iterate over the next arr[].length - subArraySize
                // by replacing the first element with the next end element in the previous sum
                // using the new sum print the average
                averages.add(sum/subArraySize);
                sum = sum - arr[i - subArraySize +1];
            }
        }
        return averages;
    }

    public List<Float> computeV3(int input[], int subArrayLength) {
        int windowStart=0;
        List<Float> averages = new ArrayList<>();
        int currentSubArrayLength = 0, currentSubArrayTotal = 0;
        for (int windowEnd = 0; windowEnd < input.length; windowEnd++) {
            currentSubArrayLength++;
            currentSubArrayTotal += input[windowEnd];
            while (currentSubArrayLength >= subArrayLength) {
                averages.add(windowStart, ((float) currentSubArrayTotal/subArrayLength));
                currentSubArrayLength -= 1;
                currentSubArrayTotal -= input[windowStart];
                windowStart++;
            }
        }
        return averages;
    }
}
