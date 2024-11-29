import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args){
        System.out.println("Enter how many times you want to flip a coin");
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int tailsCount = 0;
        double tailsPercent,headPercent;

        for(int i=0;i<n;i++){
            double randomValue = Math.random(); // Generates a value between 0.0 (inclusive) and 1.0 (exclusive)
            if(randomValue < 0.5) tailsCount++;
        }

        tailsPercent = ((double) tailsCount /n)*100;
        headPercent = 100 - tailsPercent;

        System.out.printf("Probability of getting tail over %d tosses: %.6f%n", n, tailsPercent);
        System.out.printf("Probability of getting head over %d tosses: %.6f%n", n, headPercent);
        inp.close();
    }
}
