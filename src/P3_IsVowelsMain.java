import java.util.Scanner;

public class P3_IsVowelsMain {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a alphabate: ");
        char ch= in.next().charAt(0);
        boolean alp= P3_IsVowels.isVowels(ch);
        System.out.println(alp);


    }
}
