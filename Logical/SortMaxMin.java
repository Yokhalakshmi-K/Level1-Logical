/*Write a Java program to sort an array of positive integers of an array, in the sorted array the value of the first element should be maximum, second value should be minimum value, third should be second maximum, fourth second be second minimum and so on.*/
import java.util.*;
public class SortMaxMin{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			sortMinMax(a);
	}
	public static void sortMinMax(int a[]){
		Arrays.sort(a);
		int n=a.length;
		int left=0,right=n-1;
		while(left < right){
			System.out.print(a[right--]+" ");
			System.out.print(a[left++]+" ");
			if(left == right) {
				System.out.print(a[left]+" ");
			}
		}
	}
	
}		
