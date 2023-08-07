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
}

class Program387
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
    }
}