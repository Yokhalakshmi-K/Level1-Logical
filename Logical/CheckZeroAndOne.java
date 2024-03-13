/*Write a Java program to check if an array of integers without 0 and -1.*/
import java.util.Scanner;
public class CheckZeroAndOne{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		System.out.println(check(a));
		}
	static boolean check(int a[]){
		for(int i=0;i<a.length;i++){
			if(a[i]==0 || a[i]==-1)
				return false;	
		}
		return true;
	}

}
