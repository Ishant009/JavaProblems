
import java.util.Arrays;

public class P7_ReverseWords {

    String reverseWords(String S)
    {
        if(S.length()==0|| S==null) return S;
        String[] starry= S.split("\\.");
        StringBuilder sb= new StringBuilder();
        for(int i=starry.length-1;i>=0;i--){
            System.out.println(starry[i]);
            sb.append(starry[i]).append(".");
        }
        return sb.toString().substring(0,sb.toString().length()-1);
    }

    public static void main(String[] args){
        String str="i.like.this.program.very.much";
        P7_ReverseWords p7= new P7_ReverseWords();
        String result=p7.reverseWords(str);
        System.out.println(result);
    }
}
