import java.util.Scanner;

public class P4_FloydTriagnle {

    public static void floydsTriangle(int r){
            int k=1;
            for(int i=1;i<=r;i++){
                for(int j=1;j<=i;j++){
                    System.out.print(k+++" ");
                }
                System.out.println("");
            }


            System.out.println();
        }
    }
    class Tester {
        private static Scanner in;

        public static void main(String[] args) {
            in = new Scanner(System.in);
            int r =  in.nextInt();
            P4_FloydTriagnle.floydsTriangle(r);
        }
    }

