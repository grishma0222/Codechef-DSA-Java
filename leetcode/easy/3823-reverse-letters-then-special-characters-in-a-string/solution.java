class Solution {
    public String reverseByType(String s) {
        StringBuilder s2=new StringBuilder(s);
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {
                char temp=s2.charAt(i);
                s2.setCharAt(i,s2.charAt(n-i-1));
                s2.setCharAt(n-i-1,temp);
            }
            else{
                 char temp=s2.charAt(i);
                s2.setCharAt(i,s2.charAt(n-i-1));
                s2.setCharAt(n-i-1,temp);
            }
        }
        return s2.toString();
    }
}