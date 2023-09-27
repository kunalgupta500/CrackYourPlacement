class Solution {
    public int getMaximumGenerated(int n) {
       int[] arr = new int[n+1];
        if(n == 0){
            return 0;
        }
        arr[0] = 0;
        arr[1] = 1;
        for(int i=1;i<n;i++){
            if((2*i) < n+1){
                arr[i*2] = arr[i];
            }
            else{break;}
            if(((2*i)+1) < n+1) {
                arr[(2*i)+1] = (arr[i] + arr[i+1]);
            }
            else{break;}
        }
        Arrays.sort(arr);
        return arr[arr.length-1]; 
    }
}