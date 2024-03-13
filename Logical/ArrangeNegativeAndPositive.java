/*Write a Java program to arrange the elements of an given array of integers where all negative integers appear before all the positive integers.*/
import java.util.*;
public class ArrangeNegativeAndPositive{
	public static void main(String[] args)
	 {
		
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			arrangeNegativePositive(a);
			
	}
	
	static  int arrangeNegativePositive(int a[]){
		int left=0;
		int right=a.length-1;
		while(left<=right){
			if(a[left]<0){
				left++;
			}
			else if(a[right]>=0){
				right--;
			}
			else{
				int temp=a[left];
				a[left]=a[right];
				a[right]=temp;
				left++;
				right--;
			}
		}
		for(int i=0;i<a.length;i++) {
				System.out.print(a[i]+" ");
			}
			return 1;
	}
	}
