public class Solution136 {
    class Solution136 {
        public int singleNumber(int[] nums) {
            int ans = 0;

            for (final int num : nums)
                ans ^= num;

            return ans;
        }
    }
}
