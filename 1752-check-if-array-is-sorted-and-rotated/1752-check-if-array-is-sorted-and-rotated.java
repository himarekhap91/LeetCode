class Solution {
    public boolean check(int[] nums) {
        int counter = 0;
        for(int i = 1 ; i < nums.length ; i++){
            if( !(nums[i] >=  nums[i - 1])){
                counter++;
            }

            if(counter > 1) return false;
        }


        if(counter == 0){
            return true;
        }else if(nums[nums.length - 1] > nums[0]) {
            return false;   
        }

        return true;
    }
}