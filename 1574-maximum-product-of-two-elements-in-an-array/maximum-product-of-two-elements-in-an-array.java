class Solution {
    public int maxProduct(int[] nums) {
       int Max = 0;
       for(int i = 0 ; i < nums.length; i++){
        for (int j = i+1;j<nums.length;j++){
            if(Max <(nums[i]-1)*(nums[j]-1)){
                Max = (nums[i]-1)*(nums[j]-1);
            }
        }
       }return Max;
    }
}