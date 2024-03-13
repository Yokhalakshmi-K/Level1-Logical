/*Write a Java program to find the number of even and odd integers in a given array of
integers.*/

import java.util.Scanner;
public class NumberOfEvenOdd{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		int oddCount=0;
		int evenCount=0;
		for(int i=0;i<a.length;i++){
			if(a[i]%2==0)
				evenCount++;
			else
				oddCount++;
		}
		System.out.println("The no.of even number is:"+evenCount);
		System.out.println("The no.of odd number is:"+oddCount);
	}

}
