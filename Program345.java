// Accept N numbers from user and sisplay that numbers

import java.util.*;

class ArrayX
{
    public
    int Arr[];

    ArrayX(int iSize)
    {
        Arr= new int[iSize];   // memory allocation for array
    }

    void Accept()
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr the elements:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)  // <----- by using length property
        {
            Arr[iCnt]= sobj.nextInt();
        }

        sobj.close();
    }

    void Display()
    {
        System.out.println("Elements of array are:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
        System.out.println();
    }
}

class Program345
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr number of elements:");
        int iSize = sobj.nextInt();

        ArrayX aobj= new ArrayX(iSize);

        aobj.Accept();
        aobj.Display();

        sobj.close();
    }
}