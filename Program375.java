// Accept string from user and count the frequency of word  

import java.util.*;

class Program375
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        str= str.trim(); 
        str= str.replaceAll("\\s+", " "); 

        String arr[]= str.split(" ");

        System.out.println("enter the word that you want to search:");
        String word= sobj.nextLine();

        int iFrequency= 0;
        for(String s : arr)
        {
            if(s.equals(word))
            {
                iFrequency++;
            }
        }
        System.out.println("Frequency of india word is:" +iFrequency);
    }
}
