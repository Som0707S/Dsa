class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashSet<Integer> seen = new HashSet<>(); 
        Set<Integer> bad = new HashSet<>(); 

        int prev = nums[0]; 
        seen.add(nums[0]);
        int n = nums.length; 
        for(int i =1; i < n ; i++){
            if(nums[i] != prev){
                if(seen.contains(nums[i])){
                    bad.add(nums[i]);
                }
            }

            seen.add(nums[i]);
            prev = nums[i]; 
        }

        

        return seen.size()-bad.size(); 
    }
}