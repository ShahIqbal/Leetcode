class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char a : s.toCharArray()) {
            if(map.get(a) != null) {
                map.put(a, map.get(a) + 1);    
            } else {
                map.put(a, 1);
            }
            
        }
        
        PriorityQueue<Character> queue = new PriorityQueue((x, y) -> map.get(y) - map.get(x));
        
        queue.addAll(map.keySet());
        StringBuilder builder = new StringBuilder();
        while(!queue.isEmpty()) {
            Character a = queue.poll();
            Integer count = map.get(a);
            for(int i = 0; i < count; i++) {
                builder.append(a);
            }
        }
        
        return builder.toString();
    }
}