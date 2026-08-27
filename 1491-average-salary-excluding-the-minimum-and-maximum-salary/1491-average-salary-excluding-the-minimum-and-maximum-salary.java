class Solution {
    public double average(int[] salary) {
        
        double min = Integer.MAX_VALUE;
        int max = 0;

        double sum = 0;

        for(int n : salary){
            sum+=n;

            if(min>n) min = n;
            if(max<n) max = n;
        }

        sum -= (min+max);

        return sum/(salary.length-2);
    }
}