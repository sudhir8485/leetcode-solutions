class Solution {
    public int compress(char[] chars) {
        String str = "";

        int cnt = 1;

        for(int i=1; i<chars.length; i++){
            if(chars[i]==chars[i-1]) cnt ++;
            else{
                str+= chars[i-1];
                if(cnt!=1) str += cnt;
                cnt = 1; 
            }
        }
        str+= chars[chars.length-1];
        if(cnt!=1) str += cnt;

        int i=0;
        for(char ch : str.toCharArray()){
            chars[i++] = ch;
        }

        return str.length();
    }
}