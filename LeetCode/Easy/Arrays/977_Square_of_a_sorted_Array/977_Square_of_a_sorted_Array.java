class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        
        for(int i =0 ; i < n ; i++){
            nums[i]=(nums[i]*nums[i]);
        }
        for(int i =0 ; i<n ;i++){
            for(int j =i+1 ; j <n ;j++){
                if(nums[i]>nums[j]){
                    int temp = nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        return nums;
    }
}
