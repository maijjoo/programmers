class Solution {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();

        String tmp = "";
        for(char c : new_id.toCharArray()){
            boolean isCorrect = (c >= 'a' && c <= 'z') ||
                    (c >= '0' && c <= '9') ||
                    c == '-' || c == '_' || c == '.';
            if(isCorrect)
                tmp += c;
        }
        new_id = tmp;

        while(true){
            int oriLen = new_id.length();
            new_id = new_id.replace("..",".");
            int newLen = new_id.length();

            if(oriLen == newLen){
                break;
            }
        }

        if(new_id.startsWith("."))
            new_id = new_id.replaceFirst(".","");
        if(new_id.endsWith("."))
            new_id = new_id.substring(0, new_id.length() - 1);

        if(new_id.equals(""))
            new_id = "a";

        if(new_id.length() >= 16){
            new_id = new_id.substring(0,15);
            if(new_id.endsWith(".")) {
                new_id = new_id.substring(0, new_id.length() - 1);
            }
        }

        if(new_id.length() <= 2){
            char c = new_id.charAt(new_id.length() - 1);
            for(int i = new_id.length(); i < 3; i++){
                new_id += c;
            }
        }
        return new_id;
    }
}