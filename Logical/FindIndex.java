/*Write a Java program to find the index of an array element.*/

import java.util.Scanner;
public class FindIndex{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of element");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the element");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be search");
		int element=sc.nextInt();
		boolean flag=false;
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(element==a[i]){
				index=i;
				break;
				}
				
		}
		System.out.println("The index is: "+index);
	}

}
