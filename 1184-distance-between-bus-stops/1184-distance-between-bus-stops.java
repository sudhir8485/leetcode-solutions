class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        
        int clockwise  = 0; // 1
        int anti_clockwise = 0; // 


        int i= start;
        while(i != destination){
            clockwise += distance[i];
            
            i = (i+1)%distance.length;

        }

        // 1 2 3 4  = 4
        //       i

        i= start; // 4+3+2
        //    1        1
        while(i != destination){
            if(i==0) i = distance.length;
            i--; 

            anti_clockwise += distance[i];
                     
        }

        return Math.min(clockwise, anti_clockwise);

    }
}