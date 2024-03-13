/*Write a Java program to remove a specific element from an array.*/

import java.util.*;
public class RemoveElement{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be remove");
		int element=sc.nextInt();
		int index=-1;
		for(int i=0;i<a.length;i++){
			if(element==a[i]){
				index=i;
			}
		}
		for(int i=index;i<a.length-1;i++){
			a[i]=a[i+1];
		}
		a=Arrays.copyOf(a,a.length-1);
		System.out.println("After remove the element: "+Arrays.toString(a));
	
	}

}
