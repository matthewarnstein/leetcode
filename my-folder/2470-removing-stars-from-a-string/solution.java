class Solution {
    public String removeStars(String s) {
        //StringBuffer buff = new StringBuffer(s);
        //StringBuilder buff = new StringBuilder(s);
        int index = s.indexOf('*');
        if(index == -1)
            return s;
        int last = index - 1;
        StringBuffer prefix = new StringBuffer(s.substring(0,last));
        StringBuffer postfix = new StringBuffer(s.substring(index + 1));
        //prefix.trimToSize();
        //postfix.trimToSize();
        index = postfix.indexOf("*");

        while(index != -1) {
            if(index == 0) {
                last--;
                postfix.deleteCharAt(0);
            } else {
                postfix.delete(index - 1, index + 1);
            }
            //postfix.trimToSize();
            index = postfix.indexOf("*");
        }

        if(last >= 0 && prefix.length() >= last)
            return prefix.substring(0,last) + postfix.toString();
        else
            return postfix.toString();



        
    }
}
