import java.util.Scanner;

public class JavaIfElse {
    /*
    Given an integer, n perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of  to , print Not Weird
    If  is even and in the inclusive range of  to , print Weird
    If  is even and greater than , print Not Weird
    Complete the stub code provided in your editor to print whether or not n is weird.
     */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
            int N = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            if(N%2==0){
                if(N<6 || N>20){
                    System.out.println("Not Weird");
                }else System.out.println("Weird");
            }else System.out.println("Weird");
            scanner.close();
    }
}
