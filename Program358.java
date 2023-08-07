// Accept string from user and toggle the cases in differant functions

import java.util.*;

class StringX
{
    public String StrLwrX(String str)
    {
        // Step 1: Convert string to Array
        char Arr[]= str.toCharArray();

        // Step 2: Perform operation on array
        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32);  // Typecasting
            }
        }

        // Step 3: Convert array to string
        String Ret= new String(Arr);

        return Ret;
    }
    
     public String StrUpperX(String str)
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

    public String StrToggle(String str)
    {
        // Step 1: Convert string to Array
        char Arr[]= str.toCharArray();

        // Step 2: Perform operation on array
        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt] >= 'a') && (Arr[iCnt] <= 'z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] - 32);  
            }
            else if((Arr[iCnt] >= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = (char)(Arr[iCnt] + 32); 
            }
        }

        // Step 3: Convert array to string
        String Ret= new String(Arr);

        return Ret;
    }
}

class Program358
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        StringX obj= new StringX();

        String sRet= obj.StrToggle(name);
        System.out.println("Updated string is: "+ sRet);
    }
} 