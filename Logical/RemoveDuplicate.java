/*Write a Java program to remove duplicate elements from an array.*/

import java.util.*;
public class RemoveDuplicate
{
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			Arrays.sort(a);
			int j=0;
			for(int i=1;i<a.length;i++)
			{
				if(a[i]!=a[j]){
					j++;
					a[j]=a[i];
			}
			}
				a=Arrays.copyOf(a,j+1);
			System.out.println(Arrays.toString(a));
		}
}



