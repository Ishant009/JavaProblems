
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P5_CountingFrequency {
    public void frequencyCount(int arr[], int N, int P)
    {
        // code here
        Map<Integer,Integer> map= new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int i=1;i<=N;i++){
            System.out.println(i+" "+map.get(i));
            if(map.containsKey(i)){
                arr[i-1]=map.get(i);
            }else{
                arr[i-1]=0;
            }
        }

    }

    public static void main(String[] args){
        P5_CountingFrequency p5= new P5_CountingFrequency();
        int[] arr= new int[]{2, 3, 2, 3, 5};
        p5.frequencyCount(arr,5,5);
        System.out.println(Arrays.toString(arr));
    }
}
