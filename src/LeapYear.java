import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        boolean isValidYear;
        int year;
        do {
            System.out.println("Enter the year(4-digit)");
            year = inp.nextInt();
            isValidYear = checkYear(year);
            if(!isValidYear) System.out.println("Enter a valid year");
        }while(!isValidYear);

        System.out.println(year + " is " + (checkLeapYear(year) ? "" : " not") + " a leap year!!");
        inp.close();
    }

    public static boolean checkLeapYear(int year) {
        return year % 400 == 0 || year % 100 != 0 && year % 4 == 0;
    }

    public static boolean checkYear(int year) {
        return year >= 1000 && year <= 9999;
    }


}
