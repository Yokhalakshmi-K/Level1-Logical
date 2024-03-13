/*. Write a Java program to test the equality of two arrays.*/

import java.util.Scanner;
public class EqualityOfArrays
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			int b[]=new int[n];
			System.out.println("Enter the  elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the  elements");
			for(int i=0;i<n;i++)
			{
				b[i]=sc.nextInt();
			}
			boolean isEqual=false;
			for(int i=0;i<n;i++)
			{
				if(a[i]==b[i])
					isEqual=true;
			}
			if(isEqual)
				System.out.println("The arrays are equals");
			else
				System.out.println("The arrays are not equal");
		}
}
			
