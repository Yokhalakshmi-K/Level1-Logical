/*Write a Java program to copy an array by iterating the array.*/

import java.util.*;
public class CopyOfArray{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		int arrayCopy[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			arrayCopy[i]=a[i];
		}
		
		System.out.println("The copy of array is:"+Arrays.toString(arrayCopy));
	}
}
