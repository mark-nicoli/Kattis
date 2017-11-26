import java.util.Scanner;
public class modulo
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int size = 10;
        int array[] = new int [size];
        int count = 1;
        for(int i=0;i<size;i++)
        {
            array[i] = scan.nextInt();
            if(array[i]%42==array[i+1]%42)
            {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
