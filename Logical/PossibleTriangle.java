/*Write a Java program to count the number of possible triangles from an given unsorted array of positive integers.*/
import java.util.*;
public class PossibleTriangle{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			int count=0;
			Arrays.sort(a);
			for(int i=0;i<a.length-2;i++)
			{
				for(int j=i+1;j<a.length-1;j++)
				{
					for(int k=j+1;k<a.length;k++)
					{
						if(a[i]+a[j]>a[k])
						count++;
					}
		
	 			}
			}
			System.out.println("The no.of possible triangles are: "+count);
	}
}
