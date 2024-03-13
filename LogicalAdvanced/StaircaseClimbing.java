import java.util.*;
public class StaircaseClimbing{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); 
		int climb=climbStaircase(N);
		System.out.println("Number of ways to climb staircase: "+climb);
	}
	public static int climbStaircase(int N){
		if(N<=1){
			return 1;
		}
		int[] ways=new int[N+1];
		ways[0]=1;
		ways[1]=1;
		for(int i=2;i<=N;i++){
			ways[i]=ways[i-1]+ways[i-2];
		}
		return ways[N];
	}
}
