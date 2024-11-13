import java.util.HashMap;

public class demo {
    public static void main(String[] args) {

    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int value = target - i;

            if (map.containsKey(value)) {
                return new int[]{map.get(value), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("Solution not found.");
    }
}
