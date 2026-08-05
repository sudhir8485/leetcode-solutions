class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> list = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];

            if(diff < 0) diff*=-1;

            if(min > diff) min = diff;
        }

        for(int i=0; i<arr.length-1; i++){
            int diff = arr[i+1] - arr[i];

            if(diff < 0) diff*=-1;

            if(diff==min){
                List<Integer> in = new ArrayList<>();

                in.add(arr[i]);
                in.add(arr[i+1]);

                list.add(in);
            }
        }

        return list;

    }
}