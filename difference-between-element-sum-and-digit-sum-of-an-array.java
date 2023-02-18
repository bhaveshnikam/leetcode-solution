class Solution {
    public static int differenceOfSum(int[] nums) {
        int es = 0;
        for (int i = 0; i < nums.length; i++) {
            es += nums[i];
        }
        // return es;
        int ds = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == nums[i]) {
                ds += nums[i];
            } else {
                while (nums[i] != 0) {
                    int r = 0;
                    r = nums[i] % 10;
                    ds += r;
                    nums[i] = nums[i] / 10;
                    r = 0;
                }

            }
        }
        int s = es - ds;
        s = Math.abs(s);
        return s;
    }
}
