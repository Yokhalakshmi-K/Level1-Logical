/*Write a Java program to cyclically rotate a given array clockwise by one*/
import java.util.*;
public class RotateClockwise{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		rotateArray(a);
	}
	public static void rotateArray(int a[]){
		int last=a[a.length-1];
		for(int i=a.length-1;i>0;i--){
			a[i]=a[i-1];
		}
		a[0]=last;
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
	}
}
