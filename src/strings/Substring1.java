package strings;

public class Substring1 {
    public static void main(String[] args) {
        String str="Aman Chaurasiya";
        int n=4;
        subString2(str,n);
    }





    static void substring1(String str,int n){
        for(int i=0;i<str.length()-n+1;i++){
            for(int j=i;j<i+n;j++){
                System.out.print(str.charAt(j));
            }
            System.out.print(" ");
        }
    }

    static void subString2(String str,int n){
        for(int i=0;i<=str.length()-n;i++){
            System.out.println(str.substring(i,i+n));
        }
    }
}
