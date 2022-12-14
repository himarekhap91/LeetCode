     // Approach 2 - We know the expected numbers that needs to be present as the range is 0 to n 
     // We calculate the expectedSum as we know the range 
    // We then calculate the currentSum with the elements present
    // Finally we subtract the sum 
class Solution {
    public int missingNumber(int[] nums) {

     int range = nums.length;
     int expectedSum = 0;
     int currentSum = 0;
    
     for(int i = 1; i < range+1 ; i++){
         expectedSum += i;
     }
        
      for(int i = 0; i < nums.length ; i++){
         currentSum += nums[i];
     }
      
        
        return expectedSum - currentSum;
    }
}