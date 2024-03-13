/*Write a Java program to find a missing number in an array.*/

import java.util.Scanner;
public class MissingNumber{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int l=a.length+1;
		int total=l*(l+1)/2; 			//sum of all elements from 1 to l
		int sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];
		}
		int missingNum=total-sum;
		System.out.println(missingNum);
	}

}
