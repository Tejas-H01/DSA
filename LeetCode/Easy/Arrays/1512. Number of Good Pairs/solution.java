class Solution {
    public int numIdenticalPairs(int[] nums) {

        int len=nums.length;
        int count=0;

        for(int i =0 ; i <len ; i++){
            for(int j=0 ; j<len ;j++){
                if(i<j && nums[i]==nums[j]){
                    count++;
                }
            }
        }

        return count;
        
    }
}