public class ZeroOneTriangle {
    public static void zeroOneTriangle(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                // applied the logic that each time when the row and column's sum
                // is even, there is "1" printed, otherwise "0" is printed
                /* eg. if the given number of rows is 5.
                    1
                    10
                    01
                    101
                    0101
                    10101
                */
                if((i+j)%2==0)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        zeroOneTriangle(5);
    }
}
