class Solution {
    public int[] twoSum(int[] nums, int target) {

        int[] list = new int[2];

        for (int i = 0; i < nums.length ; i++) {
            for (int j = i; j< nums.length ; j++) {
                int rest = target - nums[i];
                    if ( (i != j) && (rest == nums[j])) {
                        list[0]=i;
                        list[1]=j;                    
                    }
            }
        }        
        return list;
    }        
}

