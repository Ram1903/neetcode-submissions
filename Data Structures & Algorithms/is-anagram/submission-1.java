class Solution {
    public boolean isAnagram(String s, String t) {
        
        if(s.length()!=t.length()){
            return false;
        }
        char arr[]=new char[s.length()];
        char arr1[]=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            arr1[i]=t.charAt(i);
        }
        Arrays.sort(arr);
        Arrays.sort(arr1);
 for(int i=0;i<s.length();i++){
           if( arr1[i]!=arr[i]){
            return false;
           }
        }

        return true;
    }
}
