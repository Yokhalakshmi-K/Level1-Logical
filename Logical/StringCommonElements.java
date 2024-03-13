/*Write a Java program to find the common elements between two arrays (string values).*/

import java.util.*;
public class StringCommonElements
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			String[] a=new String[n];
			String[] b=new String[n];
			System.out.println("Enter the array1");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.next();
			}
			System.out.println("Enter the array2");
			for(int i=0;i<n;i++){
			
				b[i]=sc.next();
			}
			for(int i=0;i<a.length;i++)
			{
				for(int j=0;j<b.length;j++)
				{
					if(a[i].equals(b[j]))
						System.out.println("The common element is: "+a[i]);
				}		
			}
		}
}

