import java.util.Arrays;

public class TwoSumBruteForce {

    public static void main(String[] args) {
        int[] nums = { 3, 4, 6, 8 };
        int target = 10;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    // TODO: The condition is true.
                    // Decide how to report the matching indices i and j.
                    // Complete this step yourself before requesting the full solution.
                }
            }
        }

        // TODO: Consider what the program should do if no pair is found.
        // Save as TwoSumBruteForce.java and run this class in Eclipse.
    }
}
