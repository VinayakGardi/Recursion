public class palindrome {
    public static void main(String[] args) {
        int num=5;
        reverse(num);
        if(answer == num) {
            System.out.println(true);
        }
        else System.out.println(false);
    }
   static int answer =0;
    static void reverse(int num ) {

        if(num == 0){
            return ;                      // recursive method 1
        }
        int rem = num%10;
        answer = answer*10 +rem;
        reverse(num/10);
    }
}
