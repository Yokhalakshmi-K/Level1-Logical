/*1. Write a Java program to sort a numeric array and a string array.*/

import java.util.*;
public class SortArray{
	static int integerSort(int arr[],int n){
		int temp;
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				
				}
			
			}
		}
		
		System.out.println(Arrays.toString(arr));
		return 1;
		}
		
		
	static String stringSort(String str[],int n){
		String temp;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
			int pos=0;
			while((pos<str[j].length() && pos<str[j-1].length()) && 
				Character.toLowerCase(str[j].charAt(pos))==Character.toLowerCase(str[j-1].charAt(pos))){
				pos++;
			}
			if((pos<str[j].length() && pos<str[j-1].length()) &&
			Character.toLowerCase(str[j].charAt(pos))<Character.toLowerCase(str[j-1].charAt(pos))){
				temp=str[j-1];
				str[j-1]=str[j];
				str[j]=temp;
			
			}
			}
		}
		
		System.out.println(Arrays.toString(str));
		return " ";
		}
		
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the integer elements");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		String str[]=new String[n];
		System.out.println("Enter the String elements");
		for(int i=0;i<n;i++){
			str[i]=sc.next();
		}
		integerSort( arr, n);
		stringSort( str, n);


	}
	}


