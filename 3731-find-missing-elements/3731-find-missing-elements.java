class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        
        HashSet<Integer> set= new HashSet<>();

        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if(min>nums[i]) min = nums[i];
            if(max<nums[i]) max = nums[i];

            set.add(nums[i]);
        }

        ArrayList<Integer> list = new ArrayList<>();

        while(min<=max){
            if(!set.contains(min)){
                list.add(min);
            }
            min++;
        }

        return list;
    }
}