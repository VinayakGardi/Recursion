public class printnumbers {
    public static void main(String[] args) {
        int n=0,k=10;
        int m=10;
        printnum(n,k);
        print(m);

    }

   public static void  printnum(int n,int k ) {
         if(n == k) {
             System.out.println(n+ " ");
             return ;                             // print number till k
         }

       System.out.print(n + " ");
         printnum(n+1,k);


   }

   public static void print(int n) {
        if(n == 0) {
            System.out.println(n + " ");
            return ;                            //print numbers till 0 from n
        }
       System.out.print(n+ " ");
        print(n-1);
   }

}
