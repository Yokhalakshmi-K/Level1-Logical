/*Write a Java program to check if the sum of all the 10's in the array is exactly 30.Return false if the condition does not satisfy, otherwise true.*/
import java.util.Scanner;
public class CheckSum{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int  i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(check(a));
	}
	static boolean check(int a[]){
		int sum=30;
		int element=10;
		int temp=0;
		for(int i=0;i<a.length;i++){
			
			if(a[i]==element){
				temp=temp+element;
			}
		}
		if(temp==sum){
			return true;
			}
	return false;
	}
	
	}

