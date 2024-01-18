public class DecimalToBinary {
    public static int decimalToBinary(int decimal){
        int binary, power;
        binary = power = 0;

        while(decimal>0){
            binary += (decimal % 2) * (int) Math.pow(10,power++);
            decimal /= 2;
        }
        return binary;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(7));
    }
}
