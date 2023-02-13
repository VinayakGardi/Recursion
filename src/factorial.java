public class factorial {
    public static void main(String[] args) {
        int n=7;
        int m=7;
        int ans =1;
        int i=1;
        while(n!=0) {
            ans*=i;
            i++;
            n--;
        }
        System.out.println(ans + " Normal method");

        int answer = fact(m);
        System.out.println(answer+" Recursive method");
    }

    public static int fact(int n) {
        if(n==1) {
            return 1;
        }
        return n* fact(n-1);

    }
}
