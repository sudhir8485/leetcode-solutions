class Solution {
    public String reverseWords(String s) {
        String [] arr = s.split("\\s+");
        
        String op = "";
        int i=arr.length-1;
        for(; i>0; i--){
            op += arr[i] + " ";
        }
        op+=arr[i];

        op = op.trim();
        return op;
    }
}