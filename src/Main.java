import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /*1.Write a program that prints the numbers from 1 to 100 such that:
        If the number is a multiple of 3, you need to print "Fizz" instead of that
        number.
        If the number is a multiple of 5, you need to print "Buzz" instead of that
        number.
        If the number is a multiple of both 3 and 5, you need to print "FizzBuzz"
        instead of that number*/

        for (int i = 1; i <= 100 ; i++) {
            if(i%3!=0 && i%5!=0)
                System.out.print(i);
            if (i%3==0)
                System.out.print("Fizz");
            if (i%5==0)
                System.out.print("Buzz");

            System.out.println();
        }


        /*2.Write a Java program to reverse a string.
        Test Data: Input a string: The quick brown fox Expected Output: Reverse
        string: xof nworb kciuq ehT*/

        System.out.println("Please enter a sentence to reverse");
        String sentence = input.nextLine();
        String reversed = "";
        for (int i = sentence.length()-1; i>=0; i--) {
            reversed+=sentence.charAt(i);
        }
        System.out.println(reversed);

        /*3.Write a program to find the factorial value of any number entered
        through the keyboard.*/

        System.out.println("Enter a number to get its factorial");
        int number=input.nextInt();
        long factorial=1; //int can hold up to 12! while long can hold to 20!
        if(number<=20){
            for(int i=number;i>0;i--){
                factorial*=i;
             }
            System.out.println("Factorial of " + number + " is " + factorial);
        }else
            System.out.println("The number is too big");

        /*4.Two numbers are entered through the keyboard. Write a program to find
        the value of one number raised to the power of another. (Do not use Java
        built-in method)*/

        System.out.println("Please enter a base");
        int base = input.nextInt();
        System.out.println("Please enter its exponent");
        int exponent=input.nextInt();
        int result = 1;
        if (exponent!=0){
            for (int i = 0; i < exponent; i++) {
                result*=base;
            }
        }
        System.out.println("The result is: " + result);

        /*5.Write a program that reads a set of integers, and then prints the sum of
        the even and odd integers.*/

        int evenSum=0;
        int oddSum=0;
        int numberSet;

        do {
            System.out.println("Enter a number or 0 to quit");
            numberSet=input.nextInt();
            if(numberSet%2==0)
                evenSum+=numberSet;
            else
                oddSum+=numberSet;
        }while(numberSet!=0);

        System.out.println("Evens sum= "+evenSum + "\nOdds sum=" + oddSum);

        /*6.Write a program that prompts the user to input a positive integer. It
        should then output a message indicating whether the number is a prime
        number.*/

        System.out.println("Please enter a number");
        int prime = input.nextInt();
        int counter =0;
        boolean isPrime=false;
        for (int i = 1; i <= prime; i++) {
            if (prime%i==0){
                counter++;
            }
            if(counter==2 && prime==i) {
                isPrime=true;
            }
        }
        System.out.println(isPrime ? "This is a prime number" : "This is not a prime number");

        /*7.Use a for loop to print headings for four weeks (Weeks 1 - 4). Then use
        another for loop to print the days (Days 1 -7) for each week.
        Expected Output:*/

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++) {
                System.out.println("Day " + j);
            }
        }

        /*8.Write a program that check if the word is a palindrome or not. hint: A
        string is said to be a palindrome if it is the same if we start reading it from
        left to right or right to left. */

        System.out.println("Please enter a word");
        String word=input.next();
        String reversedWord="";
        for (int i = word.length()-1; i >= 0 ; i--) {
            reversedWord += word.charAt(i);
        }
        System.out.println(word.equalsIgnoreCase(reversedWord) ? "It is a palindrome" : "It is not a palindrome");

    }
}