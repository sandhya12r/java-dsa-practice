
class FindPivotIndex {

    public static void main(String[] args) {
        FindPivotIndex pivotIndex = new FindPivotIndex();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex.pivotIndex(nums));
    }

    public int pivotIndex(int[] nums) {
        int totalSum = 0, leftSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
