class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];

            // 1. Aradığımız sayı daha önce map'e eklendi mi?
            if (map.containsKey(rest)) {
                return new int[] {map.get(rest), i};
            }
            // 2. Henüz eklenmediyse, mevcut sayıyı ve indeksini map'e at
            map.put(nums[i], i);
        }

        return new int[0]; // Bulunamazsa (soru garantilese de genelde konur)
    }
}

// O(n) ve O(n) 
