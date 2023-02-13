public class reverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        int number =num;
        int ans=0;
        int length = length(num);
        while(length !=0) {
            int rem = num%10;
            ans=(ans*10)+rem ;           // iterative method
            num/=10;
            length--;
        }
        System.out.println(ans);


        reverse(number);
        System.out.println(answer);

        rev(number);
        System.out.println(sum);

    }
    static  int answer = 0;
    static double sum=0;
    static void reverse(int num ) {

        if(num == 0){
            return ;                      // recursive method 1
        }
        int rem = num%10;
        answer = answer*10 +rem;
        reverse(num/10);
    }

    static void rev(int num) {
        int length = length(num)-1 ;
        if(num == 0) {                   // recursive method 2
            return;
        }
        int rem = num%10;
        sum = sum +Math.pow(10,length) *rem;
        length--;
         rev(num/10);

    }

    static int length(int num) {
        int length=0;
        while(num !=0){
            int rem =num%10;
            length++;
            num/=10;

        }
        return length;
    }
}
