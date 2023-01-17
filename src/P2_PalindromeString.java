

public class P2_PalindromeString {

    public boolean palindrome(String str){
        int i=0;
        int j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;j--;
        }
        return true;
    }

    public boolean palindrome1(char[] str,int l, int r){
        if(str==null||l<0|| r<0) return false;
        if(l>=r) return true;
        if(str[l]== str[r]){
           return palindrome1(str,l+1,r-1);
        }
        return false;
    }
    public static void main(String[] args){
        P2_PalindromeString p2 = new P2_PalindromeString();
        String str= "abccba";
        char[] chars= str.toCharArray();
        boolean bl=p2.palindrome1(chars,0,str.length()-1);
        System.out.println(bl);
    }

}
