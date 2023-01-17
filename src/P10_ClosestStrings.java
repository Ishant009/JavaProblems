
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P10_ClosestStrings {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
        int w1=Integer.MIN_VALUE, w2=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<s.size();i++){

            if(s.get(i).equals(word1)){
                w1=i;
            }
            if(s.get(i).equals(word2)){
                w2=i;
            }
            if(w1!=Integer.MIN_VALUE && w2!=Integer.MIN_VALUE){

                min=Math.min(min, Math.abs(w1-w2));
            }


        }
        return min;
    }
    public static void main(String[] args){
        P10_ClosestStrings p10= new P10_ClosestStrings();
        List<String> l1= new ArrayList<>();
        l1.add("the");
        l1.add("quick");
        l1.add("brown");
        l1.add("fox");
        int res=p10.shortestDistance((ArrayList<String>) l1,"the", "fox");
        System.out.println(res);
    }
}
