import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaStdinAndStdout {
    /*
    Most HackerRank challenges require you to read input from stdin (standard input) and write output to stdout (standard output).
    One popular way to read input from stdin is by using the Scanner class and specifying the Input Stream as System.in. For example:

        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        int myInt = scanner.nextInt();
        scanner.close();

    System.out.println("myString is: " + myString);
    System.out.println("myInt is: " + myInt);
    The code above creates a Scanner object named  and uses it to read a String and an int.
    It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String).
    So, if our input is:

    Hi 5

    Our code will print:

    myString is: Hi
    myInt is: 5

    Alternatively, you can use the BufferedReader class.

    Task
    In this challenge, you must read  integers from stdin and then print them to stdout.
    Each integer must be printed on a new line.
     */
    public static void main(String[] args) throws IOException {

        System.out.println("Solution With Scanner");

        // Solution with Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type your first number:");
        int x = scan.nextInt();
        System.out.println("Please type your second number:");
        int y = scan.nextInt();
        System.out.println("Please type your third number:");
        int z = scan.nextInt();

        System.out.println("First number with Scanner is " + x);
        System.out.println("Second number with Scanner is " + y);
        System.out.println("Third number with Scanner is " + z);

        System.out.println("");
        System.out.println("Solution With BufferedReader");

        //Solution with BufferedReader
        BufferedReader stdin = new BufferedReader(new InputStreamReader(
                System.in));

        System.out.println("Please type your first number:");
        int a = Integer.parseInt(stdin.readLine());
        System.out.println("Please type your second number:");
        int b = Integer.parseInt(stdin.readLine());
        System.out.println("Please type your third number:");
        int c = Integer.parseInt(stdin.readLine());

        System.out.println("First number with BufferedReader is " + a);
        System.out.println("Second number with BufferedReader is " + b);
        System.out.println("Third number with BufferedReader is " + c);
    }
}
