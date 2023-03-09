import java.util.Scanner;

public class recursion{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("SELECT THE APPLICATION OF RECURSION");
        System.out.println("[1] Fibonacci series number");
        System.out.println("[2] Factorial of a number");
        System.out.println("[3] Reverse a number");
        System.out.println("[4] Reverse a word");
        System.out.println("[5] Tower of Hanoi");
        System.out.println("[0] Exit the Program");
        System.out.print("Select your choice : ");
        int answer = input.nextInt();

        switch(answer){
            case 1:
            System.out.println("What nth term would you want to print?");
            int number = input.nextInt();
            FibonacciPrint(number);
            break;

            case 2:
            System.out.println("Input the number to be fatorized");
            number = input.nextInt();
            FactorialPrint(number);
            break;

            case 3:
            System.out.println("Input a number to be reversed");
            number = input.nextInt();
            ReverseNumberPrint(number);
            break;

            case 4:
            System.out.println("Input a word to be reversed");
            input.nextLine();
            String word = input.nextLine();
            ReverseWordPrint(word);
            break;

            case 5:
            System.out.println("Input the number of discs: ");
            int discs = input.nextInt();
            int moves = towerOfHanoiRecursive(discs, 'A', 'C', 'B');
            System.out.println("Number of moves needed: " + moves);
            break;

            case 0:
            return;

        }
    }

    private static void FibonacciPrint(int number){
        for (int counter = 0; counter <= number; counter++) {
            System.out.print(fibonacciRecursive(counter) + " ");
        }
    }
    
    private static long fibonacciRecursive(int number){
        if (number <= 1){
            return number;
        }
        return (fibonacciRecursive(number - 1) + fibonacciRecursive(number - 2));
    }

    private static void FactorialPrint(int number){
        if(number < 0){
            System.out.println("Factorial is undefined for negative numbers.");
            return;
        }
        System.out.println("The answer is : " + factorialRecursive(number));
    }
    
    private static long factorialRecursive(int number){
        if(number == 0 || number == 1){
            return 1;
        }
        return number * factorialRecursive(number-1);
    }

    private static void ReverseNumberPrint(int number) {
        int reversedNumber = reverseRecursive(number);
        System.out.println("Reversed number is: " + reversedNumber);
    }
    
    private static int reverseRecursive(int number) {
        if (number < 10) {
            return number;
        } else {
            int lastDigit = number % 10;
            int remainingNumber = number / 10;
            return (int) (lastDigit * Math.pow(10, Integer.toString(remainingNumber).length())) + reverseRecursive(remainingNumber);
        }
    }

    private static void ReverseWordPrint(String word) {
        String reversedWord = reverseRecursive(word);
        System.out.println("Reversed word is: " + reversedWord);
    }
    
    private static String reverseRecursive(String word) {
        if (word.length() == 0) {
            return "";
        } else {
            return word.charAt(word.length() - 1) + reverseRecursive(word.substring(0, word.length() - 1));
        }
    }

    private static int towerOfHanoiRecursive(int n, char from, char to, char aux){
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return 1;
        }
        int moves = 0;
        moves += towerOfHanoiRecursive(n-1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        moves++;
        moves += towerOfHanoiRecursive(n-1, aux, to, from);
        return moves;
    }
}