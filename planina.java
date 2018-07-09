import java.util.*;
public class planina
{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);
    int iteration = scan.nextInt();
    System.out.println((int)Math.pow((Math.pow(2 ,iteration)+1),2));
  }
}

