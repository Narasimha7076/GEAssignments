import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        boolean isValidNumber = false;
        int num;

        do {
            System.out.println("Enter a number between 0 and 31: ");
            num = inp.nextInt();
            if(num >= 0 && num <= 31) isValidNumber = true;
        }while (!isValidNumber);

        for(int i = 0; i <= num; ++i) {
            System.out.println("2^ " + i + " : " + (1 << i));
        }
        inp.close();
    }
}
