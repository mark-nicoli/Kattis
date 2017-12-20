import java.util.Scanner;
public class nastyHacks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        for(int i = 0; i < size; i++)
        {
            int r = sc.nextInt();
            int e = sc.nextInt();
            int c = sc.nextInt();
            int diff = e - c;
            if(diff > r)System.out.println("advertise");
            if(diff < r)System.out.println("do not advertise");
            if(diff == r)System.out.println("does not matter");
        }
    }
}