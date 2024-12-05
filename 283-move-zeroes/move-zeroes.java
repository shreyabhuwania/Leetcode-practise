class Solution {
    public void moveZeroes(int[] arr) {
//        two pointer approach[1 0 2 4 6 0 5 0 ]
    //     int n=arr.length, j=0;
    //     for(int i=0;i<n;i++){
    //         if(arr[i]==0)
    //         {
    //             j=i;
    //             break;
    //         }
    //     }
    //     for(int i=j+1;i<n;i++){
    //         if(arr[i]!=0){
    //         swap(arr,i,j);
    //         j++;
    //         }
    //     }
    // }
    // public void swap(int arr[],int a,int b )
    // {
      
    //     int temp=arr[a];
    //      arr[a]=arr[b];
    //      arr[b]=temp;
    // }}

   // temp array approach
int c=0;
ArrayList<Integer> temp=new ArrayList<>();
for(int i=0;i<arr.length;i++){
    if(arr[i]!=0)
    {
        temp.add(arr[i]);
        c++;//store size of temp
    }
}
for(int i=0;i<c;i++){
    arr[i]=temp.get(i);
    }
for(int i=c;i<arr.length;i++){
    arr[i]=0;
}
    }}

// }}