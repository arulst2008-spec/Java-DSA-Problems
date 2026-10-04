public class RunningSum1DArray_1480 {
    public int[] runningSum(int[] nums) {
        for (int i = 1; i <= nums.length - 1; i++) {
            nums[i] = nums[i] + nums[i - 1];
        }
        return nums;
    }
}
