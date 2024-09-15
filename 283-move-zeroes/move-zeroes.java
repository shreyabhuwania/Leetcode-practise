class Solution {
    public void moveZeroes(int[] arr) {
        int n =arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                for(int j=i+1;j<n;j++)
                    if(arr[j]!=0){
                        swap(arr,i,j);
                    break;
                    }
                
            }
        }
    }
    public void swap(int arr[],int a,int b )
    {
      
        int temp=arr[a];
         arr[a]=arr[b];
         arr[b]=temp;

}}