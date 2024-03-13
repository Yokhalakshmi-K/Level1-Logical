/*Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.*/
import java.util.*;
public class SegregateZeroAndOne{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
	segregate(a);	
	for(int i=0;i<a.length;i++){
		System.out.print(a[i]+" ");
	}
	}
	public static void  segregate(int a[]){
		int left=0;
		int right=a.length-1;
		while(left<right){
			while(a[left]==0 && left<right){
				left++;
			}
			while(a[right]==1 && left<right){
				right--;
			}
			if(left<right){
				a[left]=0;
				a[right]=1;
				left++;
				right--;
			}
		}
	}

}
