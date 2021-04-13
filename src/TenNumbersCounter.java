import java.util.Scanner;

public class TenNumbersCounter {
    public static void main(String[] args) {
        System.out.println("Input a number: ");
        Scanner keyboard = new Scanner(System.in);
        int numberInput = keyboard.nextInt();
        int numberOfNegatives=0, numberOfZeros=0, numberOfPositives=0; // Start the add numbers

        // The FOR statement bellow will ask 10 random numbers and count all of the types(negative, zero and positive)
        // until the user reach 10 numbers.
        for ( int count=1;count<10;count++){
            if(numberInput<0) ++numberOfNegatives; //Start the negative counter
            if(numberInput==0) ++numberOfZeros; //Start the zero counter
            if(numberInput>0) ++numberOfPositives; //Start the positive counter
            System.out.println("Input a number again");
            numberInput = keyboard.nextInt();
            }

        //The if statement bellow will add the last number that reach the 10 number in the FOR above.
        if(numberInput<0)++numberOfNegatives;
        if(numberInput==0)++numberOfZeros;
        if(numberInput>0)++numberOfPositives;

        System.out.println("The number of negatives numbers are: "+numberOfNegatives);
        System.out.println("The number of zeros are: "+numberOfZeros);
        System.out.println("The number of positive numbers are: "+numberOfPositives);
    }
}
