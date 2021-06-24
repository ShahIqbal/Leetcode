class Solution {
    public String decodeString(String s) {
        Stack<String> resStack = new Stack<>();
        Stack<Integer> countStack = new Stack<>();
        String res = "";
        
        int idx = 0;
        
        while(idx < s.length()) {
            if(Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while(Character.isDigit(s.charAt(idx))) {
                    count = count*10 + (s.charAt(idx) - '0');
                    idx++;
                }
                countStack.push(count);
            } else if(s.charAt(idx) == '[') {
                resStack.push(res);
                res = "";
                idx++;
            } else if(s.charAt(idx) == ']') {
                StringBuilder builder = new StringBuilder(resStack.pop());
                Integer count = countStack.pop();
                for(int i = 0; i < count; i++) {
                    builder.append(res);
                }
                res = builder.toString();
                idx++;
            } else {
                res = res + s.charAt(idx);
                idx++;
            }
            
        }
        
        return res;
        
    }
}