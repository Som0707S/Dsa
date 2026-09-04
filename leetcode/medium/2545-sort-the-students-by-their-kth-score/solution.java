class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        // we are givne studnes m and n exams we have 0 index matrix of m * n each row represnt one stud and score [i][j] shouw the socre i student in the jth exam  score has distinct only 

        // we are given k . sor the stud the row of the matrics by the score in the ith exam from up to down desc 
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> b[k]-a[k]);
        int n = score.length ; 
        int m = score[0].length ; 
        for(int i = 0 ; i < n ; i++){
            pq.offer(score[i]);
        }

        int ans[][] = new int[n][m]; 
        int i = 0 ; 
        while(!pq.isEmpty()){
            ans[i] = pq.poll(); 
            i++; 
        }

        return ans; 
    }
}