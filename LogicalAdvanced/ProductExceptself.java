import java.util.*;
public class ProductExceptself{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		int[] res=productExceptself(a);
		System.out.println(Arrays.toString(res));
	}
	public static int[] productExceptself(int a[]){
		int n=a.length;
		int[] res=new int[n];
		int leftProducts[]=new int[n];
		int rightProducts[]=new int[n];
		int leftProduct=1;
		for(int i=0;i<n;i++){
			leftProducts[i]=leftProduct;
			leftProduct *=a[i];
		}
		int rightProduct=1;
		for(int i=n-1;i>=0;i--){
			rightProducts[i]=rightProduct;
			rightProduct*=a[i];
		}
		for(int i=0;i<n;i++){
			res[i]=leftProducts[i]*rightProducts[i];
		}
		return res;
	}
}
