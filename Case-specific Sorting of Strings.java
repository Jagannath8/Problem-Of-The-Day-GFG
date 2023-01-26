class Solution
{
    //Function to perform case-specific sorting of strings.
    public static String caseSort(String str)
    {
        // Your code here
        int uc=0, lc=0;
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
                uc++;
            else
                lc++;
        }
        
        char lower[]=new char[lc];
        char upper[]=new char[uc];
        int i=0,j=0;
        for(int k=0;k<n;k++){
            char ch=str.charAt(k);
            if(Character.isUpperCase(ch))
                upper[j++]=ch;
            else
                lower[i++]=ch;
        }
        
        Arrays.sort(lower);
        Arrays.sort(upper);
        
        StringBuilder ans=new StringBuilder();
        i=j=0;
        for(int k=0;k<n;k++){
            char ch=str.charAt(k);
            if(Character.isUpperCase(ch))
                ans.append(upper[j++]);
            else
                ans.append(lower[i++]);
        }
        
        return ans.toString();
    }
}
