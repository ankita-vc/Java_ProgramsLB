// Accept two strings from user and check whether they are anagrams or not irrespective of position  ***
// army and mary are anagrams of each other

import java.util.*;

class Program382
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first string:");
        String str1= sobj.nextLine(); 
        
        System.out.println("enter second string:");
        String str2= sobj.nextLine(); 
 
        str1= str1.toLowerCase();  // to convert upper to lower case
        str2= str2.toLowerCase();

        char Arr[]= str1.toCharArray();
        char Brr[]= str2.toCharArray();

        int Freq1[]= new int[26];
        int Freq2[]= new int[26];

        int iCnt= 0;

        for(iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            Freq1[Arr[iCnt] - 'a']++;
        }

        for(iCnt= 0; iCnt < Brr.length; iCnt++)
        {
            Freq1[Brr[iCnt] - 'a']++;
        }

        for(iCnt= 0; iCnt < Freq1.length; iCnt++)
        {
            if(Freq1[iCnt] != Freq2[iCnt])
            {
                break;
            }
        }

        if(iCnt == Freq1.length)
        {
            System.out.println("Strings are anagrams");
        }
        else
        {
            System.out.println("Strings are not anagrams");
        }
    }
}

