import java.util.*;
public class sibice
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();
        int array[]=new int [n];
        for(int i = 0;i<n;i++)
        {
            array[i] = scan.nextInt();
        }
        for(int i = 0;i<n;i++)
        {
            if (array[i]<= Math.sqrt(Math.pow(w,2)+Math.pow(h,2))) System.out.println("DA");
            else System.out.println("NE");
        }
    }
}
