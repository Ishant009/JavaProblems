import java.util.Arrays;
import java.util.List;

public class P3_IsVowels {

    public static boolean isVowels(char c){
        List<Character> chars= Arrays.asList('a','e','i','o','u');
        return chars.contains(c);
    }
}
