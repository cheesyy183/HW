import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercise_3 {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input radius of the flower bed: ");

        int radius = Integer.parseInt(br.readLine());
        if (radius > 0) {
            System.out.println("\nPerimeter of the flower bed is " + (2 * Math.PI * radius) + ".\n");

            System.out.println("\nArea of the flower bad is " + (Math.PI * radius * radius) + ".\n");
        }
        else System.out.println("\nIncorrect data!\n");
        System.out.println("\nWhat is your name?\n");

        String name, address;
        name = br.readLine();

        System.out.println("\nWhere are you live, " + name + "?\n");

        address = br.readLine();

        System.out.println("\nYour name is " + name + ".\nYour address is " + address + ".\n");

        System.out.print("Input standart from first call(per minute): ");
        int per_minute1 = Integer.parseInt(br.readLine());
        System.out.print("Input standart from second call(per minute): ");
        int per_minute2 = Integer.parseInt(br.readLine());
        System.out.print("Input standart from third call(per minute): ");
        int per_minute3 = Integer.parseInt(br.readLine());

        System.out.print("\nInput time of first call(in minutes): ");
        int time1 = Integer.parseInt(br.readLine());
        System.out.print("Input time of second call(in minutes): ");
        int time2 = Integer.parseInt(br.readLine());
        System.out.print("Input time of third call(in minutes): ");
        int time3 = Integer.parseInt(br.readLine());

        if ((per_minute1 > 0)&(per_minute2 > 0)&(per_minute3 > 0)&(time1 > 0)&(time2 > 0)&(time3 > 0)) {
            System.out.println("\nPrice of the first call: " + (per_minute1 * time1));
            System.out.println("Price of the second call: " + (per_minute2 * time2));
            System.out.println("Price of the third call: " + (per_minute3 * time3));
            System.out.println("Price of the all calls: " + (per_minute1 * time1 + per_minute2 * time2 + per_minute3 * time3));
        }
        else System.out.println("\nIncorrect data!\n");
    }
}
