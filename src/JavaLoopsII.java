import java.util.Scanner;

public class JavaLoopsII {
    /*
    We use the integers "a","b" and "n" to create the following series:
    (a+2^0*b),(a+2^0*b+2^1*b),(a+2^0*b+2^1*b+...+2^n-1*b)

    You are given "q" queries in the form of "a","b" and "n".
    For each query, print the series corresponding
    to the given "a","b" and "n" values as a single line of "n" space-separated integers.
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int j = 0; j < n; j++) {
                a += b;
                b *= 2;
                System.out.print(a+" ");
            }
            System.out.println();
        }

    }

}
