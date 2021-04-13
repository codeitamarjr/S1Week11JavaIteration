import java.util.Scanner;

public class NegPosZeroCount {
    public static void main(String[] args) {

        System.out.println("Enter a number:");
        Scanner keyboard = new Scanner(System.in); //created a new object keyboard.
        int numberTested = keyboard.nextInt();
        int counterWhilePositive =0 ,counterWhileNegative = 0, counterWhileZero = 0, totalPositive=0, totalNegative=0;

        while (numberTested != -999){ //While the numbers are different of -999(the sentinel value) Java will read bellow
            if(numberTested>0){
                counterWhilePositive++; //start count positive numbers
                totalPositive+=numberTested; //start to add positive numbers together
                }
            if(numberTested<0){
                counterWhileNegative++; //start count negative numbers
                totalNegative+=numberTested; //start to add negative numbers togheter
                }
            if(numberTested==0){
                counterWhileZero++; //start count zero numbers
                }
            System.out.println("Try again: ");
            numberTested = keyboard.nextInt();//
                    }

        System.out.println("You got it, the number is -999");
        System.out.println("You entered "+counterWhilePositive+" positive numbers");
        System.out.println("You entered "+counterWhileNegative+" negative numbers");
        System.out.println("You entered "+counterWhileZero+" numbers zero");
        System.out.println("The total of the positive numbers are "+totalPositive);
        System.out.println("The total of the negative numbers are "+totalNegative);
        keyboard.close(); //closed the keyboard object.
    }
}
