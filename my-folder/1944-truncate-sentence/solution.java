class Solution {
    public String truncateSentence(String s, int k) {
        if(k==0){
            return new String("");
        }
        StringBuilder sb = new StringBuilder("");
        String strArray[] = s.split(" ");
        for(int i=0;i<k;i++){
            sb.append(strArray[i]+" ");
        }
        return sb.toString().trim();
    }
}
