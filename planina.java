import java.util.*;
public class planina
{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int in= scan.nextInt();
    double b = 2.0;
    double a = Math.pow(b ,in);
    int whatever = (int)Math.pow((a+1),b);
    System.out.println(whatever);
  }
}
