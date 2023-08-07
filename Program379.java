// Accept string from user and reverse the individual word in place  ***

import java.util.*;

class Program379
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function
 
        str= str.replaceAll("\\s+", " "); 
        str= str.trim();

        String arr[]= str.split(" ");

        StringBuffer output= new StringBuffer();  // empty string buffer

        for(String s : arr)   // each word of string goes in s string
        {
            StringBuffer word= new StringBuffer(s);  // the word stored in s goes in strib=ngbuffer in order to reverse
            output.append((word.reverse()).append(" "));
        }

        String Result= new String(output);   // <---------- To remove the space at last
        Result= Result.trim();
        System.out.println("Result is: "+Result);
    }
}

/*

1. string from user
2. remove extra white spacec
3. trim the extra whitespaces
4. split the string  (Array of string)
5. reverse
6. concate the string

*/