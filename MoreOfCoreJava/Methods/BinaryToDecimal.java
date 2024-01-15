public class BinaryToDecimal {
    public static void binaryToDecimal(int binaryNumber){
        int givenNumber = binaryNumber;
        int power = 0;
        int decimal = 0;
        while(binaryNumber > 0){
            int lastDigit = binaryNumber % 10;
            decimal = decimal + (lastDigit * (int) Math.pow(2, power));

            power++;
            binaryNumber = binaryNumber/10;
        }
        System.out.println("decimal of " + givenNumber + " = " + decimal);
    }
    public static void main(String[] args) {
        binaryToDecimal(101);
    }
}
