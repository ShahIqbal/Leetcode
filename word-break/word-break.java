class Solution {
    HashMap<String, Boolean> map = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (map.containsKey(s)) return map.get(s);
        if(s.equals("")) {
            return true;
        }

        for(String word: wordDict) {
            if(s.startsWith(word)) {
                String replacedTarget = s.replaceFirst(word, "");
                map.put(replacedTarget, wordBreak(replacedTarget, wordDict));
                if(map.get(replacedTarget)) return true;
            }
        }

        return false;
    }
}