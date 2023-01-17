
import java.util.HashMap;
import java.util.Map;

public class P18_RomanToInteger {

    public int romanToDecimal(String str) {
        // code here
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int sum=0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)<str.charAt(i+1)){
                sum-=map.get(str.charAt(i));
            }else{
                sum+=map.get(str.charAt(i));
            }
        }
        sum += map.get(str.charAt(str.length()-1));
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args){
        P9_RomanToInteger p9= new P9_RomanToInteger();
        p9.romanToDecimal("IV");
    }
}
