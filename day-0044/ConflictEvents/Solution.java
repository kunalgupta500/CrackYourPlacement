class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1 = Integer.parseInt(event1[0].substring(0,2) + event1[0].substring(3,5));
        int end1 = Integer.parseInt(event1[1].substring(0,2) + event1[1].substring(3,5));
        int start2 = Integer.parseInt(event2[0].substring(0,2) + event2[0].substring(3,5));
        int end2 = Integer.parseInt(event2[1].substring(0,2) + event2[1].substring(3,5)); 


        if(start2>end1 || start1>end2)
        {
            return false;
        }   
        return true;
        }
}