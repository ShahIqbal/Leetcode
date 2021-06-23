class Solution {
    public List<String> letterCombinations(String digits) {
        HashMap<Character, String> map = new HashMap<>();
        
        if(digits.length() < 1) {
            return new ArrayList<String>();
        }
        
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        
        List<String> list = new ArrayList<>();
        
        letterCombinationsRecursive(digits, 0, "", map, list);
        return list;
        
    }
    
    public void letterCombinationsRecursive(String digits, int index, String current, HashMap<Character, String> map, List<String> list) {
        if(index >= digits.length()) {
            list.add(current);
            return;
        }
        
        String letters = map.get(digits.charAt(index));
        for(int i = 0; i < letters.length(); i++) {
            letterCombinationsRecursive(digits, index+1, current + letters.charAt(i), map, list);
        }
    }
    
}