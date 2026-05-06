class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();

        if(n1 > n2) return false;

        for(int i = 0; i <= n2 - n1; i++){
            Map<Character, Integer> map = new HashMap<>();

            // build map from s1
            for(char c : s1.toCharArray()){
                map.put(c, map.getOrDefault(c, 0) + 1);
            }

            // check current window
            boolean valid = true;

            for(int j = i; j < i + n1; j++){
                char ch = s2.charAt(j);

                if(map.containsKey(ch)){
                    if(map.get(ch) > 1){
                        map.put(ch, map.get(ch) - 1);
                    } else {
                        map.remove(ch);
                    }
                } else {
                    valid = false;
                    break;
                }
            }

            if(valid && map.isEmpty()) return true;
        }

        return false;
    }
}