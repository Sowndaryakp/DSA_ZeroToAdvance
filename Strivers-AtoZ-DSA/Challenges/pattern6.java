public class pattern6 {
    public static void nNumberTriangle(int n) {
        // Write your code here
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n1=3;
        int n2=4;
        int n3=7;

        nNumberTriangle(n1);
        nNumberTriangle(n2);
        nNumberTriangle(n3);
    }
}