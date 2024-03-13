/*Write a Java program to remove the duplicate elements of a given array and return the new length of the array.Sample array: [20, 20, 30, 40, 50, 50, 50]*/

import java.util.*;
public class LengthOfDuplicateArray{
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
			for(int i=0;i<a.length;i++){
				
					if(a[j]!=a[i]){
						j++;
						a[j]=a[i];
					
				         }
			}
			a=Arrays.copyOf(a,j+1);
			System.out.println("After removing duplicate elements the length is:"+a.length);
		}
}
