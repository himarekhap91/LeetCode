class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int max = 0;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == 1){
                maxOnes++;
                max = Math.max(maxOnes,max);
            } else {
                maxOnes = 0;
            }
        }
        
        return max;
    }
}