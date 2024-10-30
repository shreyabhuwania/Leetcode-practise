class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int num:nums){
           if(countDigits(num)%2==0){
            c++;
           }
        }
        return c;
    }
    public int countDigits(int n){
        return (int)Math.log10(n)+1;
    }
}