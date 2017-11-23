import java.util.Arrays;
import java.util.Scanner;

public class akcija
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] books = new int[n];

        for (int i = 0; i < books.length; i++)
        {
            books[i] = scan.nextInt();
        }

        Arrays.sort(books);
        long price = 0;
        for (int i = 0; i < books.length ; i ++)
        {
            if (i % 3 == books.length % 3)
            {
                continue;
            }
            price = price+books[i];
        }

        System.out.println(price);
    }
}