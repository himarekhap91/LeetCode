//22nd Feb 
    //As the array is sorted, if there are duplicates they will be in next consecuetive position. If the next number is not equal to the current number, its unique
    // First element is always unique. so start with replacing nums[1] with next unique number 

// Take two pointer at 0,1 
//Pointer 1 increments when values are not equal 
//Pointer 2 increments every time irrespecive of same element found
// when value of pointer 1 and 2 are not equal
    // switch the element in pointer 1 with one in pointer 2
   // increment pointer 1
// Easier approach - https://www.youtube.com/watch?v=zIHe2V5Py3U
class Solution {

 public int removeDuplicates(int[] nums) {
        if (nums.length <= 1 ) return nums.length;

        int i = 0;
        int j = 1;
    
        while (j < nums.length){
            if (nums[i] != nums[j]){
                nums[++i] = nums[j];
                
            }
            j++;
        }
        
        return i+1;
    }


}