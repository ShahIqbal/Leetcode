class Solution {
    public int largestAltitude(int[] gain) {
        int highestAltitude = 0;
        int cumulativeAltitude = 0;
        for(int i : gain) {
            
            cumulativeAltitude += i;
            highestAltitude = Math.max(highestAltitude, cumulativeAltitude);
        }
        
        return highestAltitude;
    }
}