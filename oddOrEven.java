import java.util.Scanner;
public class oddOrEven
{
    public static void main(String[]args)
    {
      Scanner scan = new Scanner(System.in);
      int size  = scan.nextInt();
      int array[] = new int [size];
      for(int i=0;i<size;i++)
      {
          array[i]=scan.nextInt();
      }
        for(int i=0;i<size;i++)
        {
            if(array[i]%2==0) System.out.println(array[i]+" is even");
            else System.out.println(array[i]+" is odd");
        }
    }
}
