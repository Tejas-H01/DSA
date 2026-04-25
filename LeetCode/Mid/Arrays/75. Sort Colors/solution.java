class Solution {
    public void sortColors(int[] nums) {

        int len = nums.length;
        int i , j ;

       for( i =0 ; i < len ; i++){
        for( j=i+1 ; j<len ;j++){
            if(nums[j]<nums[i]){
                int temp = nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
        }
       }
    }
}