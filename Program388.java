/*
Problems on Matrix(2D array)
*/

import java.util.*;

class Matrix
{
    public int Arr[][];

    public Matrix(int i, int j)
    {
        Arr= new int[i][j];
    }

    public void Accept()
    {
        Scanner sobj= new Scanner(System.in);

        System.out.println("enter elements: ");
        for(int i= 0; i< Arr[i].length; i++)
        {
            for(int j= 0; j< Arr[i].length; j++)
            {
                Arr[i][j]= sobj.nextInt();
            }
        }
    }

    public void Display()
    {
        System.out.println("elements of matrix are: ");
        for(int i= 0; i< Arr.length; i++)
        {
            for(int j= 0; j< Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class Program388
{
    public static void main(String Arg[])
    {
        Scanner sobj= new Scanner(System.in);
        int iRow= 0;
        int iCol= 0;

        System.out.println("enter number of rows");
        iRow= sobj.nextInt();

        System.out.println("enter number of columns");
        iCol= sobj.nextInt();

        Matrix mobj= new Matrix(iRow, iCol);  
        // Matrix mobj= new Matrix(3, 4);

        mobj.Accept();
        mobj.Display();
    }
}