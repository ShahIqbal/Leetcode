import java.util.*;

class TweetCounts {

    HashMap<String, TreeMap<Integer, Integer>> map;
    public TweetCounts() {
        map = new HashMap<>();
    }
    
    public void recordTweet(String tweetName, int time) {
        if(!map.containsKey(tweetName)) {
            map.put(tweetName, new TreeMap<Integer, Integer>());
        }
        TreeMap<Integer, Integer> treeMap = map.get(tweetName);
        treeMap.put(time, treeMap.getOrDefault(time, 0) + 1);
    }
    
    public List<Integer> getTweetCountsPerFrequency(String freq, String tweetName, int startTime, int endTime) {
        if(map.get(tweetName) == null) return null;
        
        ArrayList<Integer> list = new ArrayList<>();
        int interval = 0;
        
        if(freq.equals("minute")) {
          interval = 60;  
        } else if(freq.equals("hour")) {
            interval = 3600;
        } else {
            interval = 86400;
        }
        
        // 10, 10000
        //10010/60 = 
        int size = ((endTime - startTime)/interval) + 1;
        int[] bucket = new int[size];
        
        NavigableMap<Integer, Integer> subMap = map.get(tweetName).subMap(startTime, true, endTime, true);
        
        for(Map.Entry<Integer, Integer> entry: subMap.entrySet()) {
            int index = (entry.getKey() - startTime)/interval;
            bucket[index] += entry.getValue();
        }
        
        for(int num: bucket) list.add(num);
        
        return list;
        
    }
}

/**
 * Your TweetCounts object will be instantiated and called as such:
 * TweetCounts obj = new TweetCounts();
 * obj.recordTweet(tweetName,time);
 * List<Integer> param_2 = obj.getTweetCountsPerFrequency(freq,tweetName,startTime,endTime);
 */