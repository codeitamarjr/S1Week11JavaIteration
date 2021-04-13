import java.util.Scanner;

public class NegPosZeroCount {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner keyboard = new Scanner(System.in); //created a new object keyboard.
        int numberTested = keyboard.nextInt();
        int counterWhilePositive =0 ,counterWhileNegative = 0, counterWhileZero = 0;

        while (numberTested != -999){
            if(numberTested>0){
                ++counterWhilePositive;
                System.out.println("You entered "+counterWhilePositive+" positive numbers");
            }

            if(numberTested<0){
                ++counterWhileNegative;
                System.out.println("You entered "+counterWhileNegative+" negative numbers");
                }

            if(numberTested==0){
                ++counterWhileZero;
                System.out.println("You entered "+counterWhileZero+" numbers zero");
            }

            System.out.println("Try again: ");
            numberTested = keyboard.nextInt();

        }

        System.out.println("You got it, the number is -999\n" +
                "You tried "+(counterWhileNegative+counterWhileZero+counterWhilePositive)+" times");
        keyboard.close(); //closed the keyboard object.
    }
}
