class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str: strs) {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String value = String.valueOf(a);
            if(map.get(value) != null) {
                map.get(value).add(str);
            } else {
                ArrayList<String> lst = new ArrayList<>();
                lst.add(str);
                map.put(value, lst);
            }
        }

        List<List<String>> list = new ArrayList<>();
        list.addAll(map.values());

        return list;
    }
    
}