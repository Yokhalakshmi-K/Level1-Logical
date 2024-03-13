import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int rotate=sc.nextInt();
		for(int i=0;i<rotate;i++) {
			int j,last=a[a.length-1];
			for(j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=last;
		}
		System.out.println("Rotateed array");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}

}
