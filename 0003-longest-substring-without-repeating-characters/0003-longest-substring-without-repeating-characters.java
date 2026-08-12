class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        String str = "";
        int maxLen = 0;

        char [] arr = s.toCharArray();

        for(int i=0, j=0; i<arr.length; ){
            
            char ch = arr[i];

            if(!set.contains(ch)){
                set.add(ch);
                i++;
            }
            else {
                set.remove(arr[j]);
                j++;
            }

            maxLen = Math.max(set.size(), maxLen);

        }

        return maxLen;
    }
}