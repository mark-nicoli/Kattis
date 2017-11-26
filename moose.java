import java.util.Scanner;
public class moose
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        int left = scan.nextInt();
        int right = scan.nextInt();
        if(left!=right){
            System.out.print("Odd ");
            if(left>right) System.out.print(left*2);
            else if (right>left) System.out.print(right*2);
        }
        else if (left==right&&left!=0||right!=0)
        {
            System.out.print("Even ");
            System.out.print(left*2);
        }
        else if(right==0 && left==0) System.out.println("Not a moose");
    }
}
