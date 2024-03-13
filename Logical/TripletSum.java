/*Write a Java program to find all the unique triplets such that sum of all the three elements [x,y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2.*/

public class TripletSum
{
	public static void main(String args[]){
		int a[]={1,-2,0,5,-1,-4};
		int target=2;
		for(int i=0;i<a.length-2;i++){
			for(int j=i+1;j<a.length-1;j++){
				for(int k=j+1;k<a.length;k++){
					if(a[i]+a[j]+a[k]==target)
						System.out.println("["+a[i]+","+a[j]+","+a[k]+"]");
				}
			}
		}
	}

}
