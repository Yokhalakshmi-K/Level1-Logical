/*Write a Java program to check whether there is a pair with a specified sum of a given sorted and rotated array.*/
import java.util.*;

public class FindPairRotateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		//sorting
		for(int i=0;i<a.length-1;i++){
			if(a[i]> a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
			}
			if(i>0){
				if(a[i]< a[i-1]){
					int temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
					i=0;
				}
			}
	}
	//rotate
		for(int i=0;i<a.length-1;i++){
		   int j,last=a[a.length-1];
			for(j=a.length-1;j>0;j--){
				a[j]=a[j-1];
				
			}
			a[0]=last;
		}
		//System.out.println(Arrays.toString(a));
		System.out.println("Enter the target value");
		int target=sc.nextInt();
		//check equality
		for(int i=0;i<a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[i]+a[j]==target)
					System.out.println("The pairs are:"+"["+a[i]+","+a[j]+"]");
			}
		}
	}
}
