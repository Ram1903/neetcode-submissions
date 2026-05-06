class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();

        if(n < m) return "";
        String result = "";
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            Map<Character, Integer> map = new HashMap<>();
            for(char c : t.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }
            int count = m;
            for(int j = i; j < n; j++){
                char ch = s.charAt(j);
                if(map.containsKey(ch)){
                    if(map.get(ch) > 0){
                        count--;
                    }
                    map.put(ch, map.get(ch) - 1);
                }
                if(count == 0){
                    int windowLen = j - i + 1;
                    if(windowLen < minLen){
                        minLen = windowLen;
                        result = s.substring(i, j + 1);
                    }
                    break; 
                }
            }
        }

        return result;
    }
}