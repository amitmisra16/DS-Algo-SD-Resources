package gtci.two.pointers;

import java.util.Arrays;

public class TripletWithSmallerSum {
    public int searchTriplets(int[] nums, int target) { // O(N^2)
        int count = 0;
        Arrays.sort(nums); // O(nLog(n))
        for (int i = 0; i < nums.length; i++) { // O(N^2)
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < target) {
                    count++;
                    left++;
                } else {
                    right--;
                }
            }
        }
        return count;
    }
}
