
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input a: ");
        int a = Integer.parseInt(br.readLine());

        System.out.print("Input b: ");
        int b = Integer.parseInt(br.readLine());

        System.out.print("Input c: ");
        int c = Integer.parseInt(br.readLine());

        System.out.print("Input x: ");
        int x = Integer.parseInt(br.readLine());

        System.out.print("Input y: ");
        int y = Integer.parseInt(br.readLine());

        if (a > 0 & b > 0 & c > 0 & x > 0 & y > 0) {
            if ((a <= x | a <= y) & (b <= x | b <= y)) {
                System.out.println("\nCorrect!\nBrick passes through a rectangular hole.");
            } else if ((b <= x | b <= y) & (c <= x | c <= y)) {
                System.out.println("\nCorrect!\nBrick passes through a rectangular hole.");
            } else if ((a <= x | a <= y) & (c <= x | c <= y)) {
                System.out.println("\nCorrect!\nBrick passes through a rectangular hole.");
            } else {
                System.out.println("\nIncorrect!\nBrick doesn't pass through a rectangular hole.");
            }
        }
        else
        {
            System.out.println("\nIncorrect numbers!\nTry again!");
        }
    }
}
