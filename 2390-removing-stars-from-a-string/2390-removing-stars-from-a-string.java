class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);

        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);

            if(ch == '*'){
                sb.deleteCharAt(i-1);
                sb.deleteCharAt(i-1);
                i-=2;
            }
        }


        return new String(sb);
    }
}