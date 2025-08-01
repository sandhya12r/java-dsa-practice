class IsSortedAndRotated{
    public static void main(String[] args) {
        IsSortedAndRotated sortedAndRotated = new IsSortedAndRotated();
        int[] nums = new int[]{3,4,5,1,2};
        System.out.println(sortedAndRotated.check(nums));
    }
    public boolean check(int[] nums) {
        int count = 0, n = nums.length;
        for(int i =0 ;i<n ;i++){
            if(nums[i]> nums[(i+1)%n]){
                count++;
                if(count >1) return false;
            }
        }
        return true;
    }
}