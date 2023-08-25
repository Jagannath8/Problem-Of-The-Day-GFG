class Solution {
    int isPalindrome(String S) {
        // code here
        int i=0, j=S.length()-1;
        while(i<j/2){
            i++;
            j--;
            if(S.charAt(i)!=S.charAt(j))
                return 0;
        }
        return 1;
    }
};
