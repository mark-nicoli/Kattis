import java.util.Scanner;
public class cold_chicago
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []array = new int [size];
        int count = 0;
        for(int i = 0;i<size;i++){
            array[i] = scan.nextInt();
            if(array[i]<0)
            {
                count = count+1;
            }
        }
        System.out.println(count);
    }
}
