class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int left = 0, maxFreq = 0, maxLen = 0;

        for(int right = 0; right < s.length(); right++){
            freq[s.charAt(right) - 'A']++;//X-A=23  freq[23]=1;
            //freq[24]=1;
            
            //maxFreq=1;
            maxFreq = Math.max(maxFreq, freq[s.charAt(right) - 'A']);

            //windowSize=0-0+1
            //windowSize=2;
            int windowSize = right - left + 1;


            //(1-1)>2
            if(windowSize - maxFreq > k){
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            //maxLen=2;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}