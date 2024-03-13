/*Write a Java program to find the duplicate values of an array of integer values*/

import java.util.*;
public class FindDuplicate{


	public static void duplicate(int[] a,int n){
		
		boolean check[]=new boolean[n];
		for(int i=0;i<a.length-1;i++){
		    if(!check[i]){
		       boolean flag=false;
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					flag=true;
					check[j]=true;
				}
			}
			if(flag)
				System.out.println(a[i]);
			}
		
		}	
	
	}
	
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		duplicate(a,n);
	}

}
