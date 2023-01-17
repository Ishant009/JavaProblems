
import java.util.Arrays;


public class P17_MaxMinArray {

    static Pair getMinMax(long a[], long n)
    {
        Arrays.sort(a);
        return new Pair(a[0],a[a.length-1]);
    }
    static Pair getMinMax2(long a[], long n)
    {
        long min=Long.MAX_VALUE;
        long max= Long.MIN_VALUE;
        for(long l:a){
            if(min>l) min=l;
            if(max<l) max=l;
        }
        return new Pair(min,max);
    }

    public static void main(String[] args){
        P17_MaxMinArray p3= new P17_MaxMinArray();
        long[] arr= new long[]{8, 2, 3, 4, 5};
        Pair sum=p3.getMinMax2(arr,0l);
        System.out.println(sum.first);
        System.out.println(sum.second);
    }
}
