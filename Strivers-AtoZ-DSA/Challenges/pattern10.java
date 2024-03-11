class pattern10 {
   static void printpattern10(int n)
   {
        for(int i=0;i<=2*n-1;i++){
            int stars = i;
            if(i>n) stars=2*n-i;

            for(int j=0;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
   }
   public static void main(String[] args){
    int n=5;
    printpattern10(n);
   }
 }