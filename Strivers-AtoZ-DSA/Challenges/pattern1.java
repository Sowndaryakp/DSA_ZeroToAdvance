public class pattern1 {
    static void  printPattern1(int N) {
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        int N = 6;
        printPattern1(N);
    }
}
