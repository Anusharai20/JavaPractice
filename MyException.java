public class MyException
{
    public static void main(String[] args)
    {
        System.out.println(calculate(8,4));
        try{
            System.out.println(calculate(8,0));
        }catch(ArithmeticException eobj){
            System.out.println("Invalid Divisor. Divisor can't be Zero");
        }
        System.out.println("Please insert the other value for divisor");
    }

    public static int calculate(int dividend, int divisor){
        // try{
        return dividend/divisor;
        // }catch(ArithmeticException eobj){
        // System.out.println("Divisor is 0");
        // }
        // return 0;
    }
}    
//try catch block can be inserted in the place where the exception can occur or in the main method
