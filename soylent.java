import java.util.Scanner;
public class soylent
{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];
        double sum = 0;
        for(int i = 0;i<size;i++)
        {
            array[i]= scan.nextInt();
        }
        for(int i = 0;i<size;i++)
        {
            sum = array[i]/400;
            System.out.println(sum);
        }
    }
}
