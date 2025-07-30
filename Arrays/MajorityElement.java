class MajorityElement{

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = new int[]{1,1,1,1,2,3,3,5};
        System.out.println(majorityElement.majorityElement(nums));
    }
    public int majorityElement(int[] nums) {
        int count = 0, majorityNumber = 0;
        for (int num : nums) {
            if (count == 0) {
                majorityNumber = num;
            }
            if (num == majorityNumber) {
                count++;
            } else {
                count--;
            }
        }
        return majorityNumber;
    }
}