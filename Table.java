//printing multiplication table using scanner and loop
import java.util.Scanner;
public class Table
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.println("Enter the number you want to know the tables of: ");
        n =scan.nextInt();
        System.out.println("The multiplication of the table of " + n +" is: ");
        
        for(int i=1; i<=10;i++)
        {
            System.out.println(n + "X" + i + "=" + (n*i));
        }
    }
}