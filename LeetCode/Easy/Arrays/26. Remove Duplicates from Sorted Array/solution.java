class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int len = nums.length;
        if (nums.length == 0) 
            return 0;

        

        for (int j = 1; j < len ; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        return i + 1;
    }
}