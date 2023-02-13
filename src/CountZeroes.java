public class CountZeroes {
    public static void main(String[] args) {
        int num =30204;
        count(num);
        System.out.println(c);
    }
     static int c=0;
    public static void count(int num) {
        if(num == 0) {
            return;
        }
        int rem = num%10;
        if(rem == 0)
        c++;
        count(num/10);
    }
}
