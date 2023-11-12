class Solution{
    //Function to check if a string can be obtained by rotating
    //another string by exactly 2 places.
    public static boolean isRotated(String str1, String str2){
        // Your code here
        int n1 = str1.length();
        int n2 = str2.length();
        if(n1 != n2) 
            return false;
        String l = str1.substring(2) + str1.substring(0, 2);
        String r = str1.substring(n1 - 2) + str1.substring(0, n1 - 2);
        return l.equals(str2) || r.equals(str2);
    }
}
