public class P4_NumberOfDigits {

    public static int noOfDigits(int n){

        return (int)Math.floor(Math.log10(n)+1);
    }
}
