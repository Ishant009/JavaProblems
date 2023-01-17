
public class P16_LongestCommonPrefix {
     
    public String longestCommonPrefix(String[] arr){
        if(arr.length ==0) return "";
        String prefix= arr[0];
        for(int i=0;i<arr.length;i++){
            while(arr[i].indexOf(prefix)!=0){
                prefix= prefix.substring(0,prefix.length()-1);
            }
        }
        if(prefix.isEmpty()) return "-1";
        return prefix;
    }
    public static void main(String[] args){
        String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"};
        P8_LongestCommonPrefix p8= new P8_LongestCommonPrefix();
        String str=p8.longestCommonPrefix(arr);
        System.out.println(str);

    }
}
