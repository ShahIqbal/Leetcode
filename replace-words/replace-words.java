class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String[] split = sentence.split(" ");
        Collections.sort(dictionary);
        StringBuilder builder = new StringBuilder();
        for(String s : split) {
            boolean appendedInside = false;
            for(String dic : dictionary) {
                if(s.startsWith(dic)) {
                    builder.append(dic);
                    appendedInside = true;
                    break;
                }
            }
            if(!appendedInside) builder.append(s);
            builder.append(' ');
        }
        
        builder.deleteCharAt(builder.length() - 1);
        return builder.toString();
    }
}