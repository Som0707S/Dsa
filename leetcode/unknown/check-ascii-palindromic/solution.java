class Solution {
    public boolean palindrome(String s){
        int l = 0 ; 
        int r = s.length()-1; 
        while(l <= r){
            if(s.charAt(l) != s.charAt(r)) return false; 
            l++; 
            r--; 
        }
        return true; 
    }
    public boolean isPalindromic(String s) {
        StringBuilder str = new StringBuilder(); 
        int n = s.length(); 
        for(int i = 0 ; i < n ; i++){
            int val = s.charAt(i); 
            System.out.println(val); 
            String temp = String.format("%8s", Integer.toBinaryString(val & 0xFF))
                      .replace(' ', '0'); 
            str.append(temp); 
        }
        return palindrome(str.toString()); 
    }
}