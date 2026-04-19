class Solution {
    public int singleNonDuplicate(int[] nums) {

        int len = nums.length;
        int sol=0;
        
        for(int i : nums){
            sol=sol^i;
        }

        return sol ;
    }
}