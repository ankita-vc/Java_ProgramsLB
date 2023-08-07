// Accept two numbers from user and perform addition

import java.util.*; // import java.util.Scanner (more specific for scanner class)

class Program326
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter first number:");
        int iNo1= sobj.nextInt();

        System.out.println("enter second number:");
        int iNo2= sobj.nextInt();

        int iAns= 0;

        iAns= iNo1+iNo2;

        System.out.println("Answer is: "+iAns);
    }
}