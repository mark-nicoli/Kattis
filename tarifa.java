import java.util.Scanner;
public class tarifa
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int n = scan.nextInt();
        int ar[] = new int [n];
        int sum=0;
        for(int i = 0;i<n;i++)
        {
            ar[i] = scan.nextInt();
            sum=sum+ar[i];
        }

        System.out.println(n*x-sum+x);
    }
}
