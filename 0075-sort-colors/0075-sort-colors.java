class Solution {
    public void sortColors(int[] nums) {
        
        int zero=0, one=0, two=0;
        
        for(int n : nums){
            switch(n) {
                case 0 -> zero++;
                case 1 -> one++;
                case 2 -> two++;
            }
        }
        int index = 0;

        for(int i=0; i<zero; i++){
            nums[index++] = 0;
        }

        for(int i=0; i<one; i++){
            nums[index++] = 1;
        }

        for(int i=0; i<two; i++){
            nums[index++] = 2;
        }

    


    }
}