import java.util.Scanner;

public class JavaStaticInitializerBlock {
    /*
    You are given a class Solution with a main method.
    Complete the given code so that it outputs the area of a parallelogram with breadth "B" and height "H".
    You should read the variables from the standard input.

    If both values are greater than zero, then the main method must output the area of the parallelogram.
    Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.
     */
    static int B;
    static int H;
    static boolean flag;
    static{
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        scan.close();
        flag = B>0 && H>0;
        if (!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.println(area);
        }
    }
}
