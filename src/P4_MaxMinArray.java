package Programs;

import java.util.Arrays;

class Pair {
    long first, second;
    public Pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
};
public class P4_MaxMinArray {

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
        P4_MaxMinArray p3= new P4_MaxMinArray();
        long[] arr= new long[]{8, 2, 3, 4, 5};
        Pair sum=p3.getMinMax2(arr,0l);
        System.out.println(sum.first);
        System.out.println(sum.second);
    }
}
