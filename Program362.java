import java.util.*;

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        return str.replaceAll("\\s","");  // inbuilt function to remove all whitespaces
                            // kashala       // kashane
         //Multiple whitespaces(0/more)        with no whitespaces 
    }
}

class Program362
{
    public static void main(String Arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sobj.nextLine();

        StringX obj = new StringX();
        String sret = obj.RemoveWhiteSpace(name);

        System.out.println("Result is : "+sret);
    }
}
