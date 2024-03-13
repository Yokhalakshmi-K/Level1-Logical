/*Write a Java program to test if an array contains a specific value.*/

import java.util.Scanner;
public class ContainElement{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the  element");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search");
		int element=sc.nextInt();
		boolean flag=false;
		for(int i=0;i<a.length;i++){
			if(element==a[i])
				flag=true;
				
		}
		if(flag)
			System.out.println("The given array contain element "+element);
		else
			
			System.out.println("The given array does not contain the element "+element);
	
	}

}
