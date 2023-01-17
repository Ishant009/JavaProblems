import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class Utility2 {
    public static boolean compareArrays(int[] a1, int[] a2) {

        // Write your code here
        int len1= a1.length;
        int len2= a2.length;
        if(len1!=len2) return false;
        for(int i=0;i<len1;i++){
            if(a1[i]!= a2[i]) return false;
        }


        return true;

    }
}

class P7_RemoveDuplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        String[] splitArray = inputString.split("#");
        String[] numberArray1 = splitArray[0].split(",");
        int[] a1 = new int [numberArray1.length];
        for ( int i =0;i<numberArray1.length;i++){
            a1[i] = Integer.parseInt(numberArray1[i]);
        }

        String[] numberArray2 = splitArray[1].split(",");
        int[] a2 = new int [numberArray2.length];
        for ( int i =0;i<numberArray2.length;i++){
            a2[i] = Integer.parseInt(numberArray2[i]);
        }
        boolean result =Utility2.compareArrays(a1,a2);
        System.out.println(result);
    }
}