//Iterative Approach
public class Factorial{
    public static void main(String[] args)
    {
        int factorial = 1;
        int n = 10;
        System.out.println("The number entered for calculating the factorial is: " +n);
        for(int i = 1; i <= n; i++)
        {
            factorial = factorial * i;
        }
        System.out.println("The factorial of " +n + " is : "+factorial);
    }
}