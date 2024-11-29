import java.util.Scanner;

public class PrimeFactorisation {
    public static void main(String[] args) {
        System.out.print("Enter a  number  : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Prime factors of " + n + " : ");
        primeFactorization(n);
        input.close();
    }

    public static void primeFactorization(int n) {
        while(n % 2 == 0) {
            System.out.print("2 ");
            n /= 2;
        }

        for(int i = 3; (double)i <= Math.sqrt((double)n); i += 2) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
        }

        if (n > 2) {
            System.out.println("" + n);
        }

    }
}
