// Accept string from user and          [c:- strtok(string tokonization)]

import java.util.*;

class Program372
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter string:");
        String str= sobj.nextLine();  // Inbuilt function

        str= str.trim(); 
        str= str.replaceAll("\\s+", " "); 

        String arr[]= str.split(" ");
        System.out.println("Number of words are:" +arr.length);
    }
}
