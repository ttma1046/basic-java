package array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a sorted integer array where the range of elements are in the inclusive range
 * [lower, upper], return its missing ranges.
 *
 * For example,
 * given [0, 1, 3, 50, 75], lower = 0 and upper = 99,
 * return ["2", "4->49", "51->74", "76->99"]
 */
public class QuestionMissingRanges {
    private static List<String> findMissingRanges(int [] nums, int lower, int upper) {
        // Step 1: Define return value
        List<String> result = new ArrayList<>();

        // Step 2: Handle edge cases
        if (lower > nums[0] || upper < nums[nums.length - 1]) { return null; }

        if (nums == null || nums.length == 0) {
            result.add(lower + "->" + upper);
            return result;
        }

        // Step 3: Fill in business logic
        // first, add the range after lower
        /*
        if (lower < nums[0] - 1) {
            result.add(lower + "->" + (nums[0] - 1));
        }
        */

        addToList(result, lower, nums[0] - 1);

        // second, add all the ranges between lower and upper
        /*
        for (int i = 0; i < nums.length; i++) {
            if ((i + 1) < nums.length && nums[i] + 1 < nums[i + 1]) {
                result.add(printRange(nums[i], nums[i + 1]));
            }
        }
        */

        int prev = nums[0];

        int i = 1;

        while(i < nums.length) {
            int cur = nums[i];
            if (cur != prev + 1) {
                addToList(result, prev + 1, cur - 1);
            }

            prev = cur;
            i++;
        }

        // third, add the range before upper
        /*
        if (upper > nums[nums.length - 1] + 1) {
            result.add((nums[nums.length - 1] + 1) + "->" + upper);
        }
        */

        addToList(result, nums[nums.length - 1] + 1, upper);

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 50, 75};
        int lower = 0;
        int upper = 99;
        List<String> rst = findMissingRanges(nums, lower, upper);
        System.out.println(rst.toString());
    }

    private static void addToList(List<String> rst, int start, int end) {
        if (start == end) {
            rst.add(String.valueOf(start));
        } else if (start < end) {
            rst.add(start + "->" + end);
        }
    }

    private static String printRange(int start, int end) {
        return start < (end - 1) ? start == (end - 2) ? start + 1 + "" : (start + 1) + "->" + (end - 1) : "error";
    }
}
