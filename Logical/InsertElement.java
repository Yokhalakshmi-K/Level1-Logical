/*Write a Java program to insert an element (specific position) into an array.*/
import java.util.*;
public class InsertElement{

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		int res[]=new int[n+1];
		for(int i=0;i<a.length;i++){
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element to be insert");
		int element=sc.nextInt();
		System.out.println("Enter the element to be insert in which position");
		int index=sc.nextInt();
		for(int i=0;i<n+1;i++){
			if(i<index-1)
				res[i]=a[i];
			else if(i==index-1)
				res[i]=element;
			else
				res[i]=a[i-1];
				
		}
		System.out.println(Arrays.toString(res));
		
	}

}
