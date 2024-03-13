/*Write a Java program to compute the average value of an array of integers except the largest and smallest values.*/

import java.util.*;
public class FindAverageExceptMinMax{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int sum=0;
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(max<a[i]){
				max=a[i];
				}
			else if(min>a[i]){
				min=a[i];
				}
		}
		float avg=(sum-(max+min))/(a.length-2);
		System.out.println(avg);
	}
}
