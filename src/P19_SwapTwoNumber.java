public class P1_SwapTwoNumber {

    public static String swapNumber(int n1, int n2) {
        String swap="";
        n1= n1^n2;
        n2=n1^n2;
        n1=n1^n2;
        swap= n1+" "+n2;
        return swap;
    }
}
