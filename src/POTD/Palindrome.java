package POTD;

public class Palindrome {
    public static void main(String[] args) {
        String str="AMABCDCBAMA";
        int n=str.length();
        String palindroime = isPalindroime(str, n);
        System.out.println(palindroime);
        int num=123456;
        

    }
    static String isPalindroime(String str,int n){
        int start=0;
        int end=n-1;
        while(start<end){
            if (str.charAt(start) != str.charAt(end)) {
                System.out.println(str+"= not a palindrome");
                return "Not a palindrome";

            }
            start++;
            end--;

        }
        return "Ist a palindrome";
    }
}
