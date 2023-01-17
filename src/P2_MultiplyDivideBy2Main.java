import java.util.Scanner;

public class P2_MultiplyDivideBy2Main {

    public static void main(String[] arr){
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        System.out.println(P2_MultiplyDivideBy2.multiplyByTwo(number)+","+P2_MultiplyDivideBy2.divideByTwo(number));
    }
}
