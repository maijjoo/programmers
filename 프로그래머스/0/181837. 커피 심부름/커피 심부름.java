class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String str : order){
            String s = str.replace("ice","").replace("hot","");
            if(s.equals("anything") || s.equals("americano")){
                answer += 4500;
            }else if(s.equals("cafelatte")){
                answer += 5000;
            }
        }
        return answer;
    }
}