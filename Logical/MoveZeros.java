/*Write a Java program to move all 0's to the end of an array. Maintain the relative
order of the other (non-zero) array elements.*/

import java.util.*;
public class MoveZeros{
	public static void main(String[] args){
		int a[]={1,0,2,0,0,3,4};
		
		for(int i=0;i<a.length-1;i++){
			int temp;
			if(a[i]==0 && a[i+1]!=0){
				temp=a[i+1];
				a[i+1]=a[i];
				a[i]=temp;
			}
			if(i>0){
				if(a[i-1]==0 && a[i]!=0)
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
