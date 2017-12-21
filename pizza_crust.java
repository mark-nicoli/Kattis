import java.text.DecimalFormat;
import java.util.Scanner;
public class pizza_crust
{
    public static void main(String[]args)
    {
        DecimalFormat numberformat = new DecimalFormat("#.000000");
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int cr = r-scan.nextInt();
        double area = (Math.PI*r*r);
        double C_area = (Math.PI*cr*cr);
        double per = (C_area/area)*100;
        System.out.println(numberformat.format(per));
    }
}
