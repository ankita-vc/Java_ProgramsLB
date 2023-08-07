// Accept string from user and convert to small charcter

import java.util.*;

class StringX
{
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
        return new String(Arr);  // string object and return  <----------------
    }
}

class Program359
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