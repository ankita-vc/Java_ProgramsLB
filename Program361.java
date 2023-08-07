// Accept string from user and display the string without whitespaces (This approach is heavy)

import java.util.*;

class StringX
{
    public String RemoveWhiteSpace(String str)
    {
        char Arr[]= str.toCharArray();

        String output= "";  // empty string
        // Append chaarcters in empty string without whitespaces
        // no wastage of memory(it will not count whitespaces)

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] != ' ')
            {
                output= output + Arr[iCnt];
            }
        }

        return output;
    }
}

class Program361
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();

        String sRet= obj.RemoveWhiteSpace(name);
        System.out.println("Updated string is: "+ sRet);

        System.out.println(sRet.length());  // to check the length of string
    }
} 