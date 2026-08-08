class Solution {
    public int removeDuplicates(int[] nums) {
        
        int k=2;

        //  1 1 2 3 3 4 4 4 4 
        //                  i
        //              k

        for(int i=2; i<nums.length; i++){

            if(nums[i]!=nums[k-2]){
                nums[k] = nums[i];
                k++;

            }
        }

        return k;
    }
}