class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for(int i = 0; i < s.length(); i++){

            if(String.valueOf(s.charAt(i)).matches("[\\(\\{\\[]")){
                stk.push(s.charAt(i));
            }
            else if(stk.isEmpty()){
                return false;
            }
            else if(
                (s.charAt(i) == ')' && stk.peek() == '(') ||
                (s.charAt(i) == '}' && stk.peek() == '{') ||
                (s.charAt(i) == ']' && stk.peek() == '[')
            ){
                stk.pop();
            }
            else{
                return false;
            }
        }

        if(stk.isEmpty()) return true;

        return false;
    }
}