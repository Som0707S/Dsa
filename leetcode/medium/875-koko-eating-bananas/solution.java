class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int maxReach = 0 ;

        for (int i =0 ; i < piles.length; i ++){
            maxReach = Math.max(maxReach , piles[i]);
        }

        int left = 1 ; 
        int right = maxReach;
        int ans = 0 ;

        while(left <= right ){
            int mid = left + (right - left )/2;
            if(calculateTime(piles, mid)<=h){
                ans = mid ; 
                right = mid - 1;
            }else{
                left = mid + 1; 
            }
        }
        return ans ; 
    }

    private long calculateTime(int [] piles, int k ){
        long hours = 0 ;
        for(int i = 0 ; i< piles.length ; i++){
            hours += Math.ceil((double)piles[i]/k);
        }
        return hours ;
    }
}