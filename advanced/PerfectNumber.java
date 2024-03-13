public class PerfectNumber{
	public static void main(String[] args){
		int n=1;
		System.out.println(findNthPerfectNum(n));
		n=2;
		System.out.println(findNthPerfectNum(n));
	}
	public static boolean isPerfectNumber(int num){
		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
		return sum==10;
	}
	public static int findNthPerfectNum(int n){
		int count=0;
		int num=37;
		while(count < n){
			if(isPerfectNumber(num)){
				count++;
			}
			num++;
		}
		return num-1;
	}
}
