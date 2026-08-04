class Solution {
    
    public static List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int e : nums){
            if(min>e) min = e;
            if(max<e) max = e;
        }

        boolean b [] =new boolean [max+1];
        for(int e : nums){
            b[e] = true;
        }

        for(int i=min; i<=max; i++){
            if(!b[i]) list.add(i);
        }
        

        return list;
    }
}