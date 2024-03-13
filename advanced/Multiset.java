public class Multiset{
	public static void main(String[] args){
		int num[]={15,5,20,10,35,25};
		System.out.println(canPartition(num));
	}
	public static boolean canPartition(int[] num){
		int sum=0;
		for(int i=0;i<num.length;i++){
			sum=sum+num[i];
		}
		if(sum%2!=0)
			return false;
		int targetSum=sum/2;
		return canPartitionRecursive(num,0,targetSum);
	}
	public static boolean canPartitionRecursive(int num[],int index,int targetSum){
		if(targetSum==0){
			return true;
		}
		if(index==num.length || targetSum<0){
			return false;
		}
		return canPartitionRecursive(num,index+1,targetSum-num[index]) ||
						canPartitionRecursive(num,index+1,targetSum);
	}
}
