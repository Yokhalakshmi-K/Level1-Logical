/*Write a Java program to find the maximum and minimum value of an array.*/

import java.util.Scanner;
public class FindMaxMin{
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
			if(min>a[i])
				min=a[i];
			if(max<a[i])
				max=a[i];
		}
		System.out.println("The Minimum element is: "+min);
		System.out.println("The Maximum element is: "+max);
	}

}
