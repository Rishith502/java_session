public class Day_6_Problems {
    public static void main(String[] args){
        //nested loop
        //outer loop for rows
        for(int i=0; i<=4; i++){
            //inner loops for columns
            for(int j=0; j<i; j++){
                System.out.print("y ");
            }
            System.out.println();
        }
    }
    
}


//Two sum
        /*class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{0,0};
    }
} */
