class Reverse{
    // Complete the function
    // str: input string
    public static String reverseWord(String str){
        // Reverse the string str
        String rev = " ";
        char ch;
        for(int i = 0; i<str.length(); i++) {
            ch = str.charAt(i);
            rev = ch + rev;
        }
        return rev;
    }
}
