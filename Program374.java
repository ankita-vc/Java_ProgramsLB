// Accept string from user and count the frequency of word  

import java.util.*;

class Program374
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        str= str.trim(); 
        str= str.replaceAll("\\s+", " "); 

        String arr[]= str.split(" ");

        int iFrequency= 0;
        for(int iCnt= 0; iCnt < arr.length; iCnt++)
        {
            if(arr[iCnt].equals("india"))
            {
                iFrequency++;
            }
        }
        System.out.println("Frequency of india word is:" +iFrequency);
    }
}
