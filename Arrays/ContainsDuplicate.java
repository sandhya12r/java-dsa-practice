import java.util.HashSet;
class ContainsDuplicate {
    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] nums = new int[]{2,3,1};
        System.out.println(containsDuplicate.containsDuplicate(nums));
    }
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> value = new HashSet<>();
        for(int num : nums){
            if(value.contains(num)){
                return true;
            }
            value.add(num);
        }
        return false;
    }
}