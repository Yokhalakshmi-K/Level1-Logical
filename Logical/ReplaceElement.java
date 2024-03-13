/*Write a Java program to replace every element with the next greatest element (fro right side) in a given array of integers.*/
import java.util.*;
public class ReplaceElement{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			replace(a);
			
	}
	static void replace(int a[]){
		int n=a.length;
		int maxFromRight=a[n-1];
	
		
		for(int i=n-2;i>=0;i--){
		int temp;
			temp=a[i];
			maxFromRight=Math.max(maxFromRight,temp);
			a[i]=maxFromRight;
		}
		for(int i=0;i<a.length;i++){
				System.out.print(a[i]+" ");
			}
	}
}
