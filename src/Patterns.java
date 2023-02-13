public class Patterns {
    public static void main(String[] args) {
        int row=5;
        int col=0;
        triangle(row,col);

    }
    static void triangle(int r ,int c) {
        if(r==0) {
            return;
        }
        if(c<r) {
            triangle(r,c+1);
            System.out.print( "* ");
        }
        else {
            triangle(r-1,0);
            System.out.println();
        }
    }
}
