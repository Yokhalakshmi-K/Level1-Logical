public class MergeOverlapping{
	public static void main(String[] args){
		int interval[][]={{1,3},{8,10},{2,6},{15,18}};
		mergeOverlapping(interval);
	}
	public static void mergeOverlapping(int[][] interval){
		for(int i=0;i<interval.length-1;i++){
			if(interval[i][0] > interval[i+1][0]){
				int[] temp=interval[i];
				interval[i]=interval[i+1];
				interval[i+1]=temp;
			}
			if(i>0){
				if(interval[i][0] < interval[i-1][0]){
					int temp[]=interval[i];
					interval[i]=interval[i-1];
					interval[i-1]=temp;
					i=0;
				}
			}
		}
		int start=interval[0][0];
		int end=interval[0][1];
		for(int i=1;i<interval.length;i++){
			int currStart=interval[i][0];
			int currEnd=interval[i][1];
			if(currStart <= end){
				end=Math.max(end,currEnd);
			}
			else{
				System.out.println("["+start+","+end+"]");
				start=currStart;
				end=currEnd;
				
	        	}
		}
		System.out.println("["+start+","+end+"]");
	}
}
