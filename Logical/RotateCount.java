/*Write a Java program to find the rotation count in a given rotated sorted array of integers.*/
import java.util.Scanner;

public class RotateCount {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++){
		   int j,last=a[a.length-1];
			for(j=a.length-1;j>0;j--){
				a[j]=a[j-1];
				
			}
			a[0]=last;
			count++;
		}
		System.out.println("The rotation count is: "+count);
	}
}
