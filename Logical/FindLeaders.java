/*Write a Java program to print all the LEADERS in the array.
Note: An element is leader if it is greater than all the elements to its right side*/
public class FindLeaders{
	public static void main(String[] args){
		int[] arr={16,17,4,3,5,2};
		System.out.println("The leaders are:");
		printLeader(arr);
	}
	public static void printLeader(int[] arr){
		int n=arr.length;
		int maxRight=Integer.MIN_VALUE;
		for(int i=n-1;i>=0;i--){
			if(arr[i]>maxRight){
				maxRight=arr[i];
				System.out.print(maxRight+" ");
			}
		}
	}
}
