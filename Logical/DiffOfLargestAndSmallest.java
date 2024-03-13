/*Write a Java program to get the difference between the largest and smallest value in an array of integers. The length of the array must be 1 and above.*/

import java.util.Scanner;
public class DiffOfLargestAndSmallest{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			if(max<a[i])
				max=a[i];
			else if(min>a[i])
				min=a[i];
		}
		int diff=max-min;
		System.out.println("The difference of largest and smallest element is:"+diff);
	}
}
