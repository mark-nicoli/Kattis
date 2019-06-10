import java.util.Scanner;
public class filip
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int reverse = 0;

        while (a!=0)
        {
            reverse = reverse*10;
            reverse = reverse+a%10;
            a = a/10;
        }
        int reverse1 = 0;
        while (b!=0)
        {
            reverse1 = reverse1*10;
            reverse1 = reverse1+b%10;
            b = b/10;
        }
        if(reverse<reverse1) System.out.println(reverse1);
        else if(reverse>reverse1) System.out.println(reverse);
    }
}
