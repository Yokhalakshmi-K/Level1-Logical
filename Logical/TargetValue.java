/*Write a Java program to find the sum of the two elements of a given array which is equal to a given integer.
Sample array: [1,2,4,5,6]
Target value: 6.*/

import java.util.*;
public class TargetValue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int  i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int target=sc.nextInt();
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==target)
					System.out.println("The pairs are:"+"["+a[i]+","+a[j]+"]");
			}
		}
	}
}
