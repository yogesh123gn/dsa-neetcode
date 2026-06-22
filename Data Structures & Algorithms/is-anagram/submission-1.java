class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> hm = new HashMap<>();

        for(char C : s.toCharArray()){
            hm.put(C, hm.getOrDefault(C,0)+1);
        }
        for(char C : t.toCharArray()){
            hm.put(C, hm.getOrDefault(C,0)-1);
        }
        for(char C : hm.keySet()){
            if(hm.get(C) != 0){
                return false;
            }
        }
        return true;
    }
}
