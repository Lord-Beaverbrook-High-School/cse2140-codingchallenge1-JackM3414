import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner myScan = new Scanner(System.in);
        System.out.println("Enter a 4 digit year");
        int year = myScan.nextInt();
        int digitOne=year%10;
        // Gets the ones digit by using the % operator, which finds the remainder of a division statement, uses int to ensure that there's no decimals
        year=year/10;
        //Updates the year variable to exclude the ones digit, so the four-digit number becomes a three-digit number
        int digitTwo=year%10;
        //variable to get the tens value through the % operator, uses int to ensure that there's no decimals
        year=year/10;
        // updates year to exclude the tens value, so the three-digit number becomes a two-digit number
        int digitThree=year%10;
        //Variable to get the hundreds digit using the % operator, uses int to ensure that there's no decimals
        year=year/10;
        //Updates year to exclude hundreds digit, so the two-digit number is now a one-digit number
        int digitFour=year%10;
        //Final variable to find thousands digit through % operator, uses int to ensure that there's no decimals
        System.out.println(digitFour);
        //Prints thousands place first
        System.out.println(digitThree);
        //Prints hundreds place second
        System.out.println(digitTwo);
        //Prints tens place third
        System.out.println(digitOne);
        //Prints ones place last
        //Print statements from digit four to digit one, as the digit four variable has the thousands digit, while digit one has the ones place. the "println" statement is used in order to print the value, and move the cursor to the next line for the next value
        /* using MATHEMATICAL operations (no Strings), split a year
        Example: if the user enters 1989, the output would be:
        1
        9
        8
        9

         */
    }
}
//Comment on how you tested the code to make sure it works in all situations
//include tests that you ran
//I tested the code by giving it different four digit values, such as 1989, 1984, 0001, 1001, 4509, 3047, 1207, and 0210, all of which worked how the program is intended to.