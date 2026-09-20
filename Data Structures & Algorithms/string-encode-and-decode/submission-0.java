class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded_str = new StringBuilder("");
        for(String str: strs){
            encoded_str.append(str.length()).append("#").append(str);
        }
        return encoded_str.toString();
    }

    public List<String> decode(String s) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < s.length()) {
            // Find the position of the delimiter '#'
            int delimiterIndex = s.indexOf('#', i);
            
            // Extract the length of the next string
            int length = Integer.parseInt(s.substring(i, delimiterIndex));
            
            // Extract the string using the length
            int start = delimiterIndex + 1;
            int end = start + length;
            result.add(s.substring(start, end));
            
            // Move index to the start of the next length prefix
            i = end;
        }

        return result;
    }
}
