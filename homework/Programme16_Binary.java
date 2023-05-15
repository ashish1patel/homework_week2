package homework;

public class Programme16_Binary {
    public static void bin() {
        int x = 0b10;
        int y = 0b11;
        int z = x + y;
        System.out.println("Sum of two binary numbers : " + Integer.toBinaryString(z));
    }

    public static void main(String[] args) {

        bin();
    }

}
