public class SumOfnumbers {
    public static void main(String[] args) {
            int n=10;
            int ans=0;
            int m=10;
            while(m !=0) {
                ans+=m;
                m--;
            }
        System.out.println(ans +" Normal method");
        System.out.println(sum(n)+ " Recursive method");


        int digits =1342;
        int digit=1342;
        int rem ;
        ans=0;
        while(digits!=0) {
            rem = digits%10;
            ans+=rem;
            digits/=10;
        }

        System.out.println(ans +"Normal method");
        System.out.println(sumation(digit) +" Recursive method");
        System.out.println(prod(505));

    }
    public static int sum(int n) {
        if(n==0) {
            return 0 ;                 // sum of numbers till n
        }
        return n+sum(n-1);
    }

    public static int sumation(int n) {
        if(n==0) {
            return 0;
        }                                  // sum of digits of the number
      int rem = n%10;
        return rem+sumation(n/10);

    }

    public static int prod(int n) {
        if(n%10==n) {
            return n;                     // product of digits

        }
        int rem = n%10;
        return rem * prod(n/10);
    }
}
