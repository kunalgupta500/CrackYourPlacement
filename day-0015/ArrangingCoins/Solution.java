class Solution {
    public int arrangeCoins(int n) {
    int count = 0;
    for(int i=1; i<=n; i++){
            n = n - i;
            count++;
            if(n < 0){
                break;
            }
        }

        return count;
    }
}