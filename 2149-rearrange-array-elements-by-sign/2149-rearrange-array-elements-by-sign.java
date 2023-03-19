class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> positive = new ArrayList<>();
        List<Integer>  negative = new ArrayList<>();
        
        for(int i : nums){
            if(i > 0) positive.add(i);
            if(i < 0) negative.add(i);
        }
        
        for(int i=0 ; i < positive.size() ; i++){
            nums[i*2] = positive.get(i);
        }
        
        for(int i = 0 ; i < negative.size() ;i++){
            nums[(i*2) + 1] = negative.get(i);
        }
        
        return nums;
    }
}