import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args){
        System.out.print("Enter a  number  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int numerator = 1;
        int denominator = 1;

        int commonFactor;
        for(commonFactor = 1; commonFactor < n; ++commonFactor) {
            numerator = (commonFactor + 1) * numerator + denominator;
            denominator = (commonFactor + 1) * denominator;
        }

        commonFactor = highestCommonFactor(numerator, denominator);
        System.out.println("The " + n + " Harmonic Number is " + numerator / commonFactor + "/" + denominator / commonFactor);
        input.close();
    }

    public static int highestCommonFactor(int a, int b) {
        return b == 0 ? a : highestCommonFactor(b, a % b);
    }

}
