class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> countMap = new HashMap<>();
        int occurrence = nums.length / 2;
        
        for(int i = 0 ; i < nums.length ; i++){
            countMap.put(nums[i], countMap.getOrDefault(nums[i],0) + 1);
        }
        
        for(Map.Entry<Integer,Integer> entry : countMap.entrySet()){
            if(entry.getValue() > occurrence){
                return entry.getKey();
            }
        }
        
        return 0;
    }
}