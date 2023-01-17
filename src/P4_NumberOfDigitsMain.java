import java.util.Scanner;

public class P4_NumberOfDigitsMain {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int number= sc.nextInt();
        P4_NumberOfDigits numberOfDigits= new P4_NumberOfDigits();
        int num= numberOfDigits.noOfDigits(number);
        System.out.println(num);
    }
}
