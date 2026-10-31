class Solution {
    public boolean isAnagram(String s, String t) {

        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();
        Map<Character,Integer> map = new HashMap<>();

        if (sChars.length != tChars.length) {
            return false;
        }

        for (char c : sChars) {            
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            } else {
                map.put(c, 1);
            }
        }

        for (char c : tChars) {
            if (!map.containsKey(c)) {
                return false;
            }
            map.put(c, map.get(c)-1);
        }

        return map.values().stream().allMatch(v -> v ==0);

    }
}
