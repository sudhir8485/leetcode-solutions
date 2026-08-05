class Solution {
    public int myAtoi(String s) {

        boolean isNegative = false;

        s = s.trim();

        if(s.length()==0) return 0;

        char sign = s.charAt(0);

        int i=0;
        if(sign=='-'){
            isNegative = true; 
            i++;
        } 
        if(sign=='+'){
            i++;
        } 

        long num = 0;
        
        for( ; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch<'0' || ch>'9') break;

            num = num*10 + (ch-'0');

            if(num>Integer.MAX_VALUE){
                if(isNegative) return -2147483648;
                return 2147483647;
            }
            

        }

        

        if(isNegative) num*=-1;

        return (int)num;

        
    }
}