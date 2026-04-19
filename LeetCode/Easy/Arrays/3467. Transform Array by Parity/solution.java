class Solution {
    public int[] transformArray(int[] nums) {

        int len = nums.length;
        int count =0;
        for (int num : nums) {
            if (num % 2 == 0) {
                count++;
            }
        }
        for(int i=0 ; i<len ; i++){
            if(i<count) 
                nums[i]=0;
            else
                nums[i]=1;
        }
    return nums ;   
    }
}