//Fibonacci Series Program in Java
//Iterative Approach
public class FibonaccoiSeries
{
    public static void main(String [] args)
    {
        int a, b, c, n;
        //a and b always contains the last two terms whereas c always contains the next term
        a = 1;
        b = 1;
        n = 5;
        System.out.println("The first " + n + " terms of the Fibonaccoi series are: ");
        for(int i = 0; i < n; i++)
        {
            if(i==0){
                System.out.println(a + " ");
            }else if(i==1){
                System.out.println(b + " ");
            }else{
                c = a + b;
                System.out.println(c);
                a = b;
                b = c;
            }
        }
    }
}