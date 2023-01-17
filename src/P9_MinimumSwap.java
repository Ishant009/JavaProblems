import java.util.Arrays;
import java.util.Scanner;

class Utility3 {

    static int minimumBribes(int[] final_queue) {
        //  Write your code here
        int[] tempSorted= Arrays.copyOf(final_queue,final_queue.length);
        Arrays.sort(tempSorted);
        int len= final_queue.length;
        System.out.println(Arrays.toString(tempSorted));
        int count=0;
        for(int i=0;i<len;i++){
            if(final_queue[i]!=tempSorted[i]){
                count++;
                swap(final_queue,i,indexOf(tempSorted,final_queue[i]));
            }

        }
        return count;
    }
    public static int indexOf(int arr1[],int element){
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==element) return i;
        }
        return -1;
    }
    public static void swap(int[] arr,int i, int j){
        arr[i]=arr[i]^arr[j];
        arr[j]=arr[i]^arr[j];
        arr[i]=arr[i]^arr[j];
    }
}


class P9_MinimumSwap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        in.close();
        String queue[] = input.split(",");
        int final_queue[] = new int[queue.length];
        for (int i = 0; i < queue.length; i++) {
            final_queue[i] = Integer.parseInt(queue[i]);
        }
        int bribe = Utility3.minimumBribes(final_queue);
        if (bribe == -1) {
            System.out.println("Messed up queue");
        } else {
            System.out.println(bribe);
        }
    }
}