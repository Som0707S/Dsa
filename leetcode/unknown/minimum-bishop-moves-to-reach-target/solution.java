class Solution {
    public int minBishopMoves(int[] source, int[] target) {
        // if in same diagonal one if in white and black then -1

        // if not same diagnoal then 2 

        // if source + source 2 == smae answer is t
        if(source[0] == target[0] && target[1] == source[1]) return 0; 
        boolean sameDiagonal = false; 
        if(source[0]+ source[1] == target[0] + target[1]){
            sameDiagonal = true; 
        }
        else if(source[0] - source[1] == target[0] - target[1]) sameDiagonal = true; 
        if(sameDiagonal) return 1; 

        // diff color = no 

        if((source[0] + source[1]) % 2 != (target[0] + target[1]) %2)return -1; 

        return 2; 
        
    }
}