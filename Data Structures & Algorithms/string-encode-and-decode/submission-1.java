class Solution {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (String s : strs) {
            //This line encode each string as <Length>#<String>
            //if s="hello" then it store as 5#hello
            //if s = "" then it store as 0#
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') j++;
            int len = Integer.parseInt(str.substring(i, j));
            j++;
            result.add(str.substring(j, j + len));
            i = j + len;
        }

        return result;
    }
}