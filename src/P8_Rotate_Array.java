import java.util.Arrays;
import java.util.Scanner;


class Utility1 {
    public static int[] rotateArray(int[] numbers,int steps){
        //Write your code here
        int[] temp= new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            temp[(i+steps)% numbers.length]=numbers[i];
        }


        return temp;
    }
}


class P8_Rotate_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] inputString = in.nextLine().split("#");
        int[] numbers = Arrays.stream(inputString[0].split(",")).mapToInt(Integer::parseInt).toArray();
        int steps = Integer.parseInt(inputString[1]);

        System.out.println(Arrays.toString(Utility1.rotateArray(numbers,steps)));
    }
}
