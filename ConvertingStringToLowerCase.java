//converting all the characters in a string to lower case
public class ConvertingStringToLowerCase
{
    public static void main(String[] args)
    {
        String s = "BE YOURSELF, everyone else is already TAKEN.";
        
        //Converting the above string to lowercase
        String lowers = s.toLowerCase();
        
        //displaying 
        System.out.println("The Original String is: " + s);
        System.out.println("The Converted String is: " + lowers);
    }
}