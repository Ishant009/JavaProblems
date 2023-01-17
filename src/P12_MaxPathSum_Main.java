import java.util.Arrays;
import java.util.Scanner;

public class P6_MaxPathSum_Main {

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        String inputString= sc.nextLine();
        String[] splitArray= inputString.split("#");
        int[][] matrix= new int[splitArray.length][splitArray.length];
        for(int i=0;i< splitArray.length;i++){
            String[] row= splitArray[i].split(",");
            for(int j=0;j<row.length;j++){
                matrix[i][j]= Integer.parseInt(row[j]);
            }
        }
        System.out.println(P6_MaxPathSum.maxSum(matrix));
       int[] arr= new int[]{1,9,2,5,7,4,};
        Arrays.sort(arr,0,3);
        System.out.println(Arrays.toString(arr));

    }
}
