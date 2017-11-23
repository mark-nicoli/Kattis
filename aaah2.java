import java.util.Scanner;
public class aaah2
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        String jon = scan.nextLine();
        String doc = scan.nextLine();
        char john[] = jon.toCharArray();
        char doctor[] = doc.toCharArray();
        if(jon.charAt(john.length-1)=='h'&&doc.charAt(doctor.length-1)=='h')
        {
            if(jon.length()>doc.length())
                System.out.println("go");
            else if(jon.length()<doc.length())
                System.out.println("no");
            else
                System.out.println("go");
        }
    }
}
