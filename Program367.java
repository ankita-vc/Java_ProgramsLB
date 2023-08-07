// Acceot string and count the frequency of each letter (String should be in small case)

import java.util.*;

class Program367
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");

        String str= sobj.nextLine();  // Inbuilt function

        char Arr[]= str.toCharArray();   // string is converted into charcter array

        str= str.toLowerCase();

        int Freq[]= new int[26];  // empty array with the size 26
        int iCnt= 0;

        for(char ch : Arr)   // for each loop  <---------------- we have to travel whole array
        {
            Freq[ch - 'a']++;  
            // eg:- to calculate d ---->  100 - 97 = 3  we get the index of d 
        }
        System.out.println("Frequency of each letter is:");
        for(iCnt= 0; iCnt < Freq.length; iCnt++)
        {
            if(Freq[iCnt] != 0)
            {
                System.out.println("Frequency of "+(char)(iCnt+'a') +" is: " + Freq[iCnt]);
            }
        }
    }
}

/*
 1. Convert string into lower case (inbuilt function)

 2. Logic:

    a   97  0
    b   98  1
    c   99  2
    d   100 3

*/