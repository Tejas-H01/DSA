class Solution {
    public int countNegatives(int[][] grid) {
        int neg =0;
        int j =0 ;
        for(int i =0 ; i < grid.length ; i++){
            for(j =0 ; j <grid[i].length ; j++){
                if(grid[i][j] < 0){
                    neg+=1;
                }
            }
            
        }
        return neg;
    }
}