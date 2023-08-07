// Accept string from user and count number of words

import java.util.*;

class Program371
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        if(str.length() == 0)   // <--------
        {
            System.out.println("Number of words are: 0");
            return;
        }
        
        str= str.trim();
        str= str.replaceAll("\\s+", ""); 

        int iFrequency= 0;
        for(int iCnt= 0; iCnt < str.length(); iCnt++)
        {
            if(str.charAt(iCnt) == ' ');
            {
                iFrequency++;
            }
        }

        System.out.println("Number of words are:" +(iFrequency+1));
    }
}
