/*Write a Java program to find smallest and second smallest elements of a given array.*/
public class SmallestAndSecondSmallest{
	public static void main(String[] args){
		int arr[]={12,13,1,10,34,1};
		findSmallestAndSeconfSmallest(arr);
	}
	public static void findSmallestAndSeconfSmallest(int[] arr){
		int smallest=Integer.MAX_VALUE;
		int secondSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++){
			if(arr[i]<smallest){
				secondSmallest=smallest;
				smallest=arr[i];
			}else if(arr[i]<secondSmallest && arr[i]!=smallest){
				secondSmallest=arr[i];
			}
		}
		System.out.println("Smallest element:" +smallest);
		System.out.println("Second Smallest element:" +secondSmallest);
	}
}
