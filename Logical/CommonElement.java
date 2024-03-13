/*Write a Java program to find common elements from three sorted (in
non-decreasing order) arrays.*/

import java.util.Scanner;
public class CommonElement
{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arr3[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr1[i]=sc.nextInt();
		}
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr2[i]=sc.nextInt();
		}
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			arr3[i]=sc.nextInt();
		}
		int i=0,j=0,k=0;
		while(i<arr1.length  &&  j<arr2.length && k<arr3.length){
			if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k]){
				System.out.print("The common element is:"+arr1[i]);
				i++;
				j++;
			        k++;	
			}
			else if(arr1[i] < arr2[j]){
					i++;
			}
			else if(arr2[j] < arr3[k]){
					j++;
			}
			else{
					k++;
			}		
		}
	}
}
