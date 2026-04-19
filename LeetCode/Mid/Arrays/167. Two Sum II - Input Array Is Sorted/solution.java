class Solution {
    public int[] twoSum(int[] numbers, int target) {

       int len = numbers.length;

       int right=len-1;
       int left =0 ;
       int sol[] = new int[2];

       while(left<right){
        if(numbers[left]+numbers[right]==target){
            sol = new int[] {left+1,right+1};
            return sol;
        }else if(numbers[left]+numbers[right]<target){
            left++;
        }else{
            right--;
        }
       }

       return sol;
    }
}