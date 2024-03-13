/*Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is close to zero.*/
import java.util.*;
public class CloseToSumZero{
	public static void main(String[] args){
		int[] array={1,60,-10,70,-80,85};
		findCloseToZerosum(array);
	}
	public static void findCloseToZerosum(int[] num){
		Arrays.sort(num);
		int left=0;
		int right=num.length-1;
		
		int minSum=Integer.MAX_VALUE;
		int minLeft=0;
		int minRight=0;
		while(left<right){
			int sum=num[left]+num[right];
			if(Math.abs(sum)<Math.abs(minSum)){
				minSum=sum;
				minLeft=left;
				minRight=right;
			}
			if(sum<0)
				left++;
			else if(sum>0)
				right--;
			else
				break;
		}
		System.out.println(num[minLeft]+" "+num[minRight]);
	}
}
