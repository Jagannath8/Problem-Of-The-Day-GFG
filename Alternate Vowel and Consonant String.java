class Solution{
    public String rearrange(String S, int N){
        int[]vowels=new int[26];
        int[]consonants = new int[26];
        int noOfVowels=0;
        int noOfCons=0;
        char smallestVowel='u';
        char smallestCons='z';
        
        for(char c:S.toCharArray()){
            if(c=='a' ||c=='e' ||c=='i' ||c=='o' ||c=='u'){
                vowels[c-'a']++;
                noOfVowels++;
                smallestVowel=(char)Math.min((int)smallestVowel,(int)c);        
            }else{
                consonants[c-'a']++;
                noOfCons++;
                smallestCons=(char)Math.min((int)smallestCons,(int)c); 
            }
        }
        
        if(Math.abs(noOfVowels-noOfCons)>1)return "-1";
        
        boolean isVowel=false;
        
        if(noOfVowels>noOfCons){
            isVowel=true;
        }else if(noOfCons>noOfVowels){
            isVowel=false;
        }else{
            if(smallestVowel<smallestCons){
                isVowel=true;
            }else{
                isVowel=false;
            }
        }
        
        StringBuilder sb=new StringBuilder();
        int i=0;
        int j=0;
        while(i<26 && j<26){
            if(isVowel){
                while(i<26 && vowels[i]==0)i++;
                if(i==26)break;
                sb.append((char)('a'+i));
                vowels[i]--;
                isVowel=false;
            }else{
                while(j<26 && consonants[j]==0)j++;
                if(j==26)break;
                sb.append((char)('a'+j));
                consonants[j]--;
                isVowel=true;
            }
        }
        return sb.toString();
    }
}
