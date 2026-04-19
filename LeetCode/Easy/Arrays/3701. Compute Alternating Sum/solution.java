class Solution {
    public int alternatingSum(int[] nums) {

        int len = nums.length;
        int sum=0;

        for(int i=0 ; i < len ; i++){
            
            if(i%2==0){
                sum=sum+nums[i];
            }else{
                sum=sum-nums[i];
            }
        }
        return sum ;
        
    }
}