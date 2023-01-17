package Programs;
public class P1_SumOfDigits {

    public int sumOfDigits(int number){
        int sum=0;
        while(number>0){
            sum+=number%10;
            number=number/10;
        }
        return sum;
    }
    public int sodRecursion(int number){
        if(number==0) return 0;

        return number%10+sodRecursion(number/10);
    }

    public int sodString(String num){
        int sum=0;
        for(int i=0;i<num.length();i++){
            sum+=num.charAt(i)-'0';
        }
        return sum;
    }
    public static void main(String[] args){
        P1_SumOfDigits p1= new P1_SumOfDigits();
        int sum=p1.sodString("250");
        System.out.println(sum);
    }
}
