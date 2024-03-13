/*Write a Java program to find the common elements between two arrays of integers.*/

import java.util.*;

public class IntegerCommon{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		System.out.println("Enter the elements for array1");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements for array2");
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j]){
					System.out.println("The common element is: "+a[i]);
				}
			}
			
		}
	}
}
