class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> hm = new HashMap<>();

        for (String str : strs) {
            int[] count = new int[26];

            for(char c : str.toCharArray()){
                count[c-'a']++;
            }

            String countString = Arrays.toString(count); 
            hm.putIfAbsent(countString, new ArrayList<>());
            hm.get(countString).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
