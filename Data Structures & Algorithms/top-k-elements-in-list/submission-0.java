class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.merge(num, 1, (oldVal, newVal) -> oldVal + newVal);
        }

        return map.entrySet()
            .stream()
            .sorted(
                (a, b)
                    -> Integer.compare(b.getValue(), a.getValue())) // frekansa göre büyükten küçüğe
            .limit(k) // ilk k entry
            .mapToInt(Map.Entry::getKey) // entry → sayı
            .toArray();
    }
}

// merge'in yaptigi bu; Yani lambda her seferinde “eski sayaç + 1” hesaplıyor. Key yoksa lambda hiç
// devreye girmiyor ve başlangıç değeri olarak 1 konuyor. if (map.containsKey(num)) {
//     map.put(num, map.get(num) + 1);   // lambdanın yaptığı iş
// } else {
//     map.put(num, 1);                  // key yoksa value'yu koyma
// }