class Solution{
	int modulo(String s, int m) {
		//Write your code here
		int base = 1;
        int dec_value = 0;
        int len = s.length();
        for (int i = len - 1; i >= 0; i--) {
            if (s.charAt(i) == '1')
                dec_value += base;
            
            dec_value %=m;
            base = base * 2;
            base %=m;
        }
        return dec_value%m;
	}
}
