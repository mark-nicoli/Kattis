import java.util.Scanner;
public class bijele
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int size = 6;
        int array[]= {1,1,2,2,2,8};
        int array2[] = new int [size];
        for(int i = 0;i<size;i++)
        {
            array2[i] = scan.nextInt();
            System.out.print(array[i]-array2[i]+" ");
        }
    }
}
