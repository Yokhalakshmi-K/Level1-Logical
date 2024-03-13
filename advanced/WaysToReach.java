import java.util.*;
public class WaysToReach{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.println(countWays(row,col));
	}
	public static int countWays(int N,int M){
		int dp[][]=new int[N][M];
		for(int i=0;i<N;i++){
			dp[i][0]=1;
		}
		for(int i=0;i<M;i++){
			dp[0][i]=1;
		}
		for(int i=1;i<N;i++){
			for(int j=1;j<N;j++){
				dp[i][j]=dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[N-1][M-1];
	}
}
