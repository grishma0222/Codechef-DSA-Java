class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        int n=text.length();
        int c=0;
        boolean flag=true;
        for(int i=0;i<n;i++){
            char ch=text.charAt(i);
        if(ch==' '){
                if(flag)
                {
                       c++;
                }
            
           flag=true;
           }
           else{
            if(brokenLetters.indexOf(ch)!=-1){
                flag=false;
            }
           }
        }
        if(flag){ c++;}
        return c;
    }
}