package Programs;

public class P3_SumOfArray {

    public int sumOfArray(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum;
    }
    public int sumOfArrayRecursion(int[] arr,int i){
        if(i>= arr.length) return 0;
        return arr[i]+sumOfArrayRecursion(arr,i+1);
    }
    public static void main(String[] args){
        P3_SumOfArray p3= new P3_SumOfArray();
        int[] arr= new int[]{1, 2, 3, 4, 5};
        int sum=p3.sumOfArrayRecursion(arr,0);
        System.out.println(sum);
    }
}
