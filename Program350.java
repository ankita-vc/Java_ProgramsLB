// Accept string from user and display size of string using length method

import java.util.*;

class Program350
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter your name:");
        String name= sobj.nextLine();

        System.out.println("Name is: "+ name);

        System.out.println("Length of string is: "+ name.length());  // This is lenght menthod
    }
}