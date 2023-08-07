// Logic of removing extra whitespaces i.e mre than one whitespace

import java.util.*;

class Program369
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");

        String str= sobj.nextLine();  // Inbuilt function

        str= str.replaceAll("\\s+", " ");
        str= str.trim();   // <------------

        System.out.println("updated strinf is: "+str);
    }
}

/*

\\s+ == for only one whitespace 
\\s++

*/