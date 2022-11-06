// Approach 1 - Take 3 variables, 0count; 1count; 2count and loop through the array and calculate the values. Loop again and fill the array using these count variables


// Approach 2 - 3 pointer or Dutch national problem algo. This is possible because an array can contaon only 3 values . so we can compare the value with a different value and swap accordingly as we know that array should contain the elements in the following order : 0 , 1 , 2
// low pointer - denotes index to be filled with 1
// high pointer - denotes index to be filled with 2
// mid pointer - this pointer will be used for comparison and used for swap . At any time mid contain 3 possible values - 0 , 1, 2 
// If mid = 0 we swap with low , mid = 2 we swap with high. Once this is done remaining indexes would be filled with 1 automatically 

class Solution {
    public void sortColors(int[] nums) {
        int low = 0 ;
        int high = nums.length - 1 ;
        int mid = 0;
            
        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;

            } else if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                //mid++;
                high--;
            } else if(nums[mid] == 1) {
                // Mid is 1 no action needed
                mid++;
                
            }
        }
        
    }
}