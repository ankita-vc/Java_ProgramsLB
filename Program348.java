// Accept N numbers from user and display addition of elements

import java.util.*;

class ArrayX
{
    protected int Arr[];
    public ArrayX(int iSize)
    {
        Arr= new int[iSize];   // memory allocation for array
    }

    protected void Accept()
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr the elements:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)  // <----- by using length property
        {
            Arr[iCnt]= sobj.nextInt();
        }
    }

    protected void Display()
    {
        System.out.println("Elements of array are:");

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            System.out.print(Arr[iCnt] + "\t");
        }
        System.out.println();
    }
}

class MyArray extends ArrayX
{
    public MyArray(int iSize)
    {
        super(iSize);   // to access the constructor from parent class
    }

    public int Addition()
    {
        int iSum= 0;

        for(int iCnt= 0; iCnt < Arr.length; iCnt++)
        {
            iSum= iSum + Arr[iCnt];
        }
        return iSum;
    }
}

class Program348
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("Enetr number of elements:");
        int iSize = sobj.nextInt();

        MyArray mobj= new MyArray(iSize);
        mobj.Accept();
        mobj.Display();

        int iRet= mobj.Addition();

        System.out.println("Addition of all elements is: " + iRet);
    }
}