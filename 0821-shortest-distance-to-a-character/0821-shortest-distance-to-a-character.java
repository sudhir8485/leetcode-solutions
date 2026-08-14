class Solution {
    public int[] shortestToChar(String s, char c) {
        
        int arr [] = new int [s.length()];
        //int arr2 [] = new int [s.length()];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(ch!=c){
                arr[i] = -1;
            }
        }

        int cnt = 0;
        boolean flag = false;
        for(int i=0; i<arr.length; i++){
            
            if(arr[i]==0){
                flag = true;
            }

            if(flag){
                if(arr[i]==0) cnt = 0;
                arr[i] = cnt++;
            }
        }

        cnt = 0;
        flag = false;
        for(int i=arr.length-1; i>=0 ;i--){
            
            if(arr[i]==0){
                flag = true;
            }

        if(flag){
            if(arr[i]==0) cnt = 0;
            if(arr[i]==-1) arr[i] = cnt++;
            else{
                arr[i] = Math.min(cnt++, arr[i]);
            }
        }
        }

        return arr;
    }
    
}