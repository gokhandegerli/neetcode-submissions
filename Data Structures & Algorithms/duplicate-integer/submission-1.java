class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer, Integer> numberOfNumbers = new HashMap<>();

        for (int num : nums) {
            if (numberOfNumbers.containsKey(num)){
                numberOfNumbers.put(num, numberOfNumbers.get(num)+1);
            } else {
                numberOfNumbers.put(num, numberOfNumbers.getOrDefault(num, 0)+1);
            }          
        }

        return numberOfNumbers.values().stream().anyMatch(v -> v != null && v > 1);      
    }
}