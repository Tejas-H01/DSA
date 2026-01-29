class Solution {
    public int[] runningSum(int[] nums) {


        int sum=0;
        for(int i =0 ; i <nums.length;i++){
            sum+=nums[i];//sum=1/1;sum=1+2/3=2;sum=3+3/6
            nums[i]=sum;//[1,3,6,..]
        }

        return nums;

    }
}