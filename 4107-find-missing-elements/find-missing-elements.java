class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

            int smallest = nums[0];
            int largest = nums[0];

        for(int i = 0 ; i < nums.length ; i++){

            if(smallest>nums[i]){
                smallest = nums[i];
            }
            if(largest < nums[i]){
                largest = nums[i];
            }
        }

            for(int j = 0 ; j<nums.length; j++ ){
                
                    set.add(nums[j]);
            }
                
            
         List<Integer> ans = new ArrayList<>();

        for (int i = smallest +1 ; i<largest; i++){
            if(!set.contains(i)){
                ans.add(i);
            }
        }return ans; 
        
    }
}