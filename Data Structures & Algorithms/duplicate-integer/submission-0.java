class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int i : nums){
            freq.put(i, freq.getOrDefault(i, 0)+1);
        }

        for(int i : nums){
            int t = freq.get(i);
            if(t > 1){
                return true;
            }
        }

        return false;
    }
}