public class reverseNumber {
    static void printReverseNumber(int n){
        int reversedNumber =0;

        while(n!=0){
            int remainder = n%10;
            reversedNumber = reversedNumber*10+remainder;
            n=n/10;
        }
        System.out.println(reversedNumber);
    }
    public static void main(String[] args){
        int number = 123;
        printReverseNumber(number);
    }
}
