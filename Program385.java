// Accept two strings from user and check whether they are anagrams or not irrespective of position  ***
// army and mary are anagrams of each other
// filter, 

import java.util.*;

class Program385
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first string:");
        String str1= sobj.nextLine(); 
        
        System.out.println("enter second string:");
        String str2= sobj.nextLine(); 

        if(str1.length() != str2.length())   // <------- filter 
        {
            System.out.println("Strings are not anagrams");
            return;
        }
 
        str1= str1.toLowerCase();  // to convert upper to lower case
        str2= str2.toLowerCase();

        char Arr[]= str1.toCharArray();
        char Brr[]= str2.toCharArray();

        int Freq[]= new int[26];

        int iCnt= 0;

        for(iCnt= 0; iCnt < Arr.length; iCnt++)  // <-------------- reduce space complexity
        {
            Freq[Arr[iCnt] - 'a']++;  // ekane ++
            Freq[Brr[iCnt] - 'a']--;  // ekane --
        }

        for(iCnt= 0; iCnt < Freq.length; iCnt++)
        {
            if(Freq[iCnt] != 0)
            {
                break;
            }
        }

        if(iCnt == Freq.length)
        {
            System.out.println("Strings are anagrams");
        }
        else
        {
            System.out.println("Strings are not anagrams");
        }
    }
}

