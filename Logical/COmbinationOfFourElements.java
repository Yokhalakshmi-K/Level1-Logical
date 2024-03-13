/*Write a Java program to find all combination of four elements of an given array whose sum is equal to a given value.*/
import java.util.*;
public class COmbinationOfFourElements{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the target value");
		int target=sc.nextInt();
		int sum=0;
		System.out.print("The pair is:");
		for(int i=0;i<a.length-3;i++){
			for(int j=i+1;j<a.length-2;j++){
				for(int k=j+1;k<a.length-1;k++){
					for(int l=k+1;l<a.length;l++){
						if(a[i]+a[j]+a[k]+a[l]==target)
						System.out.println("["+a[i]+","+a[j]+","+a[k]+","+a[l]+"]");
					}
				}
			}
		}
		
	}
}
