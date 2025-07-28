
class TwoSum {

    public static void main(String[] args) {
        TwoSum twoSumInstance = new TwoSum();
        int a[] = twoSumInstance.twoSum(new int[]{1,2,3,4,5,6,7,8}, 6);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int arr[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                    break;
                }

            }
        }
        return arr;
    }
}
