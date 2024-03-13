/*Write a Java program to add two matrices of the same size.*/

import java.util.Scanner;
public class MatrixSum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int row=sc.nextInt();
		System.out.println("Enter the column");
		int col=sc.nextInt();
		int a[][]=new int[row][col];
		int b[][]=new int[row][col];
		int c[][]=new int[row][col];
		System.out.println("Enter the elements in array1");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the elements in array2");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.print(c[i][j]+" ");		
			}
		
		}
		
	}
}
