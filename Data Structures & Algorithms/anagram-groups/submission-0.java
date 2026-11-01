class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        List<String> sorted = Arrays.stream(strs)
                .map(s -> {
                    char[] c = s.toCharArray();
                    Arrays.sort(c);
                    return new String(c);
                })
                .toList();

        for (int i = 0; i < strs.length; i++) {
            map.computeIfAbsent(sorted.get(i), k -> new ArrayList<>()).add(strs[i]);
        }

        return new ArrayList<>(map.values());
    }
}