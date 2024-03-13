/*Write a Java program to reverse an array of integer values.*/
import java.util.*;
public class ReverseArray{
	public static void reverse(int[] a){
		int left=0;
		int right=a.length-1;
		int temp;
		while(left<right){
				temp=a[right];
				a[right]=a[left];
				a[left]=temp;
	
				left++;
				right--;
				
			}
		
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		reverse(a);
		System.out.println(Arrays.toString(a));
	}

}
