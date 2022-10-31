// Approach 1 - Sort the array. Loop from 0 to n and check if the number is equal to the value in that position
Arrays.sort(nums);
int length = nums.length + 1;
for(int i = 0 ; i < length; i++){
if(i == nums.length){
return i;
} else if(!(i == nums[i])){
return i;
}
}
return 0;