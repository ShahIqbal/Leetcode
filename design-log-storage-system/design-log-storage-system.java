import java.util.*;

class LogSystem {

    public static String MIN = "2000:01:01:00:00:00";
    public static String MAX = "2017:12:31:23:59:59";
    
    HashMap<String, Integer> granularityMap;
    TreeMap<String, List<Integer>> treeMap;
    public LogSystem() {
        treeMap = new TreeMap<>();
        
        granularityMap = new HashMap<>();
        granularityMap.put("Year", 4);
        granularityMap.put("Month", 7);
        granularityMap.put("Day", 10);
        granularityMap.put("Hour", 13);
        granularityMap.put("Minute", 16);
        granularityMap.put("Second", 19);
    }
    
    public void put(int id, String timestamp) {
        if(!treeMap.containsKey(timestamp)) {
            treeMap.put(timestamp, new ArrayList<Integer>());
        }
        treeMap.get(timestamp).add(id);
        
    }
    
    public List<Integer> retrieve(String start, String end, String granularity) {
        int index = granularityMap.get(granularity);
        String ourStart = start.substring(0, index) + MIN.substring(index);
        String ourEnd = end.substring(0, index) + MAX.substring(index);
        List<Integer> retrieveids = new ArrayList<>();
        
        NavigableMap<String, List<Integer>> subMap = treeMap.subMap(ourStart, true, ourEnd, true);
        
        for(String key : subMap.navigableKeySet()) {
            retrieveids.addAll(subMap.get(key));
        }
        
        return retrieveids;
        
    }
}

/**
 * Your LogSystem object will be instantiated and called as such:
 * LogSystem obj = new LogSystem();
 * obj.put(id,timestamp);
 * List<Integer> param_2 = obj.retrieve(start,end,granularity);
 */