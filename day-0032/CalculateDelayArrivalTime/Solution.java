class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ans=arrivalTime+delayedTime;
        int result=ans%24;
        return result;
    }
}