import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the no.of elements");
			int n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("Enter the elements");
			for(int i=0;i<n;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println("Enter the target elements");
			int target=sc.nextInt();
			boolean found=binarySearch(a,target);
			if(found){
				System.out.println(target+" "+"is found in a list");
			}else
							System.out.println(target+" " +"is Not found in a list");
	}
	static boolean binarySearch(int a[],int target){
		int left=0,right=a.length-1;
		while(left<right){
			int mid=left+(right-left)/2;
			if(a[mid]==target){
				return true;
			}else if(a[mid]<target){
				left=mid+1;
			}else{
				right=mid-1;
			}
		}
		return false;
	}
}
