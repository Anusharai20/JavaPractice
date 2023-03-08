//If Else Statement of Loop
/**Syntax
   if(Condition){
       statement(S)
   }else{
       Statement(S)
   }
   */
public class If_Else
{
    public static void main(String[] args)
    {
        int a = 129;
        int b = 105;
        int Sum = a + b;
        int Difference = a - b;
        System.out.println("The sum  is : " +Sum);
        System.out.println("The difference  is : " +Difference);
        if(Sum >=100 && Difference <= 100){
            System.out.println("The sum is greater than 100 and the difference is less than 100.");
        }else{
            System.out.println("The sum is less than 100 and the difference is greater than 100.");
        }
    }
}
