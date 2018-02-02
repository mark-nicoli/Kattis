import java.util.Scanner;
public class simonsays {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i<size; i++)
        {
            String string = scan.nextLine();
            if (string.startsWith("simon says") && !string.equals("simon says")) System.out.println(string.substring(11));
            else System.out.println();
        }
    }

}