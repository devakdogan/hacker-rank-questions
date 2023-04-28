import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops {
    /*
    Given an integer, N, print its first N multiples.
    Each multiple  (where ) should be printed on a new line in the form: N x i = result.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 1; i <= 10; i++) {
                System.out.println(N +" x "+i +" = "+ N*i);
        }
        bufferedReader.close();
    }
}
