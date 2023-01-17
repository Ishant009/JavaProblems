public class P5_SumOfNumbers {

    public static int sum(int n){
        if(n==1) return 1;
        else return n+sum(n-1);
    }
    public static void main(String[] args){
        System.out.println(P5_SumOfNumbers.sum(10));
    }
}
