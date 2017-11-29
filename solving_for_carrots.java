import java.util.Scanner;
public class solving_for_carrots
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int print = scan.nextInt();
        String string[] = new String[n];
        for(int i =0;i<n;i++)
        {
            string[i] = scan.nextLine();
        }
        System.out.println(print);
    }
}
