class Solution {
    public void moveZeroes(int[] nums) {
        
        int len = nums.length ;
        int[] temp= new int[len];
        int counter=0;
        
        if(len>1){
        for(int i=0 ; i < len ; i++){
            if(nums[i]!=0 ){
                
                temp[counter] = nums[i];
                counter++;
                nums[i]=0;
            }
        }
        
        for(int i=0 ; i <len ; i++){
            if(i<=counter)
                nums[i]=temp[i];
            else
                nums[i]=0;
        }
        
        }
    }
}