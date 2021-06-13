class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int[] i: rectangles) {
            int recMin = Math.min(i[0], i[1]);
            max = Math.max(max, recMin);
            if(map.get(recMin) != null) {
                map.put(recMin, map.get(recMin) + 1);
            } else map.put(recMin, 1);
            
        }
        
        return map.get(max);
    }
}