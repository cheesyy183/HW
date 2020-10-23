import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_2 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("\nInput n(n > 0): ");

        int n = Integer.parseInt(br.readLine());

        if (n > 0)
        {
            int temp = n * n;
            int val = 0;

            do
            {
                val = temp % 10;

                if (val == 3)
                {
                    System.out.println("\nNumber 3 is included in the number n * n = " + (n*n) + ".\n");
                    break;
                }

                temp = temp / 10;

            } while (temp != 0);

            if (val != 3)
            {
                System.out.println("\nNumber 3 isn't included in the number n * n = " + (n*n) + ".\n");
            }

            val = 0;
            temp = n;
            int reverse_n = 0;

            do {
                val = temp % 10;
                temp = temp / 10;

                reverse_n = reverse_n * 10 + val;
            } while (temp != 0);

            System.out.println("\nThe reverse order of the digits of the number " + n + " is " + reverse_n + ".\n");

            temp = n;
            val = temp % 10;
            reverse_n = val;
            int count = 0;

            if (temp / 10 != 0 & temp != 10 & temp / 100 != 0) {
                while (temp != 0) {
                    temp = temp / 10;
                    count++;
                }

                temp = 1;
                for (int i = 1; i < count; i++)
                {
                    temp = temp * 10;
                }

                reverse_n = ((val * temp + n % temp) - val) + (n / temp);

                System.out.println("\nPermutation of the first and last digit of the number " + n + " is " + reverse_n + ".\n");
            }
            else if (temp == 10)
            {
                System.out.println("\nPermutation of the first and last digit of the number 10 is 1.\n");
            }
            else if (temp / 10 == 0)
            {
                System.out.println("\nPermutation of the first and last digit of the number " + n + " is " + n + ".\n");
            }
            else
            {
                reverse_n = reverse_n * 10 + temp / 10;
                System.out.println("\nPermutation of the first and last digit of the number " + n + " is " + reverse_n + ".\n");
            }

            if (n / 10 == 0)
            {
                reverse_n = n + 1;
            }
            else {
                if (n / 100 == 0) {
                    reverse_n = (n / 10 + 1) * 10 + (n % 10 + 1);
                }
                else reverse_n = (((n / temp) + 1) * temp + n % temp) + 1;
            }

            System.out.println("Adding one to the beginning and end of a number n: " + reverse_n);
        }
        else {
            System.out.println("\nIncorrectly entered data!\nTry again!\n");
        }
    }
}
