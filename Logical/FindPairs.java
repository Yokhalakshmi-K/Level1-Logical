/*Write a Java program to find all pairs of elements in an array whose sum is equal to a specified number.*/

import java.util.Scanner;
public class FindPairs
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the  elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the  target value");
			int target=sc.nextInt();
			int sum=0;
			System.out.println("The pairs are:");
			for(int i=0;i<a.length-1;i++)
			{
				for(int j=i+1;j<a.length;j++){
				sum=a[i]+a[j];
				if(sum==target)
					System.out.println("["+a[i]+","+a[j]+"]");
			}
			}
		}
	}
