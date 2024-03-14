import java.util.Scanner;
class palindrome{
    static int printPalindrome(int n){
        int pali = 0;
        while(n>0){
            int remainder = n%10;
            pali = pali*10+remainder;
            n/=10;
        }
        return pali;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int copynum = num;
        int palindrome = printPalindrome(num);
        if(palindrome == copynum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not");
        }
    }
}