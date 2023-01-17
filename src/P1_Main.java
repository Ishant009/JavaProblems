import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P1_Main {
    private static Scanner in;
    public static void main(String[] args){
        in = new Scanner(System.in);
        String inputString= in.nextLine();
        System.out.println(inputString);
        List<String> inputData= Arrays.stream(inputString.split(",")).collect(Collectors.toList());
        int n1= Integer.parseInt(inputData.get(0));
        int n2= Integer.parseInt((inputData.get(1)));
        String swap= P1_SwapTwoNumber.swapNumber(n1,n2);
        System.out.println(swap);
    }
}
