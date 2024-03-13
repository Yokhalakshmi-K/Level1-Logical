/*Write a Java program to separate 0s on left side and 1s on right side of an array of 0s and 1s in random order.*/
import java.util.*;
public class Separate{
	public static void main(String[] args){
		int a[]={1,0,0,1,1,1,0};
		
		for(int i=0;i<a.length-1;i++){
			int temp;
			if(a[i]==1&& a[i+1]!=1){
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
			if(i>0){
				if(a[i-1]==1&& a[i]!=1)
				{
					temp=a[i];
					a[i]=a[i-1];
					a[i-1]=temp;
					i=0;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
