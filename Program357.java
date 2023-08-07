// Accept string from user and convert to capital charcter

import java.util.*;

class StringX
{
    public String StrUpper(String str)
    {
        // Step 1: Convert string to Array
        char Arr[]= str.toCharArray();

        // Step 2: Perform operation on array
        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);  // Typecasting
            }
        }

        // Step 3: Convert array to string
        String Ret= new String(Arr);

        return Ret;
    }
}

class Program357
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();

        String sRet= obj.StrUpper(name);
        System.out.println("Updated string is: "+ sRet);
    }
} 