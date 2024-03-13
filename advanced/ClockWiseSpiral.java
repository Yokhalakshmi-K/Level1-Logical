public class ClockWiseSpiral{
	public static void main(String args[]){
		int a[][]={{1,2,3,4,5},
		    {6,7,8,9,10},
		    {11,12,13,14,15},
		    {16,17,18,19,20}};
		    int rowStart=0,rowEnd=a.length;
		    int colStart=0,colEnd=a[0].length;
		    while(rowStart<rowEnd && colStart<colEnd){
		    	for(int i=colStart;i<colEnd;i++){
		    		System.out.print(a[rowStart][i]+" ");
		    	}
		    	rowStart++;
		    	for(int i=rowStart;i<rowEnd;i++){
		    		System.out.print(a[i][colEnd-1]+" ");
		    	}
		    	colEnd--;
		    	for(int i=colEnd-1;i>=colStart;i--){
		    		System.out.print(a[rowEnd-1][i]+" ");
		    	}
		    	rowEnd--;
		    	for(int i=rowEnd-1;i>=rowStart;i--){
		    		System.out.print(a[i][colStart]+" ");
		    	}
		    }
	}
}
