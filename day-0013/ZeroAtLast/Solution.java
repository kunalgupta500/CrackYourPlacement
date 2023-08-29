class Solution {
    public static void main(String[] args) {
       int[] arr={0,1,0,2,0,3,0,7,6,0};
       for(int i=0;i<arr.length;i++)
       {
           if(arr[i]==0)
           {
               for(int j=i;j<arr.length-1;j++)
               {
                   arr[j]=arr[j+1];
               }
               arr[arr.length-1]=0;
           }
       }
       for(int k=0;k<arr.length;k++)
       {
           System.out.print(arr[k]+" ");
       }
    }
}


//Another solution
/* class HelloWorld {
    public static void main(String[] args) {
       int[] arr={1,5,0,2,0,0,3,0,7,6,0};
       int count=0;
       int temp;
       for(int i=0;i<arr.length;i++)
       {
         if(arr[i]!=0)
         {
             //swap(arr[i],arr[count])
             temp=arr[i];
             arr[i]=arr[count];
             arr[count]=temp;
             count++;
         }
       }
       for(int k=0;k<arr.length;k++)
       {
           System.out.print(arr[k]+" ");
       }
    }
}
*/