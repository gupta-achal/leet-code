class Solution {
    public String largestOddNumber(String num) {
        
        StringBuilder sb = new StringBuilder("");
        for(int i=num.length()-1; i>=0; i--){
            int val = num.charAt(i) - '0';
            if(val %2 == 1){
                sb.append(num.substring(0,i+1));
                break;
            }
        }
        return sb.length() == 0? "" : sb.toString();
    }
}