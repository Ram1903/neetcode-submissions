class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int len=numbers.length;
        int arr[]=new int[2];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(numbers[i]+numbers[j]==target){
                    arr[0]=i+1;
                    arr[1]=j+1;
                    return arr;
                }
            }
        }
        return arr;
    }
}