/*Write a Java program to find the length of the longest consecutive elements sequence from a given unsorted array of integers.Sample array: [49, 1, 3, 200, 2, 4, 70, 5]*/
import java.util.*;
public class ConsecutiveLength
{
	public static void main(String[] args){
		int arr[]={49,1,3,200,2,4,70,5};
		if(arr.length==0)
			System.out.println("The length is 0");
		Arrays.sort(arr);
		int maxLength=1;
		int currLength=1;
		for(int i=1;i<arr.length;i++){
			if(arr[i]!=arr[i-1]){
				if(arr[i]==arr[i-1]+1){
					currLength++;
				}
				else{
					maxLength=Math.max(maxLength,currLength);
					currLength=1;
				}
			}
		}
		System.out.println("The length of consecutive sequence is:"+maxLength);
	}

}
