/*Write a Java program to separate even and odd numbers of an array of integers. Put all even numbers first, and then odd numbers.*/
import java.util.*;
public class OddEvenSorting{

	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5};
		int temp[]=new int[a.length];
		int j=a.length-1;
		int k=0;
		int dummy;
		for(int row=0;row<a.length;row++){
			for(int col=row+1;col<a.length;col++){
				if(a[row]<a[col]){
					dummy=a[col];
					a[col]=a[row];
					a[row]=dummy;
				}
			}
		}
		for(int i=0;i<a.length;i++){
			
			if(a[i]%2==0){
				
				temp[k]=a[i];
				k++;
				}
				else{
				
					temp[j]=a[i];
					j--;
				
				}
		
		}
		System.out.println(Arrays.toString(temp));
		
		
		
		
	}

}
