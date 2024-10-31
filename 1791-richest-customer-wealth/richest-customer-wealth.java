class Solution {
    public int maximumWealth(int[][] accounts) {
        int res=Integer.MIN_VALUE;
        for(int[] x:accounts){
            int sum=0;
            for(int x1:x){
                sum+=x1;
            }
            if(sum>res){
                res=sum;
            }
        }
        return res;
    }
}