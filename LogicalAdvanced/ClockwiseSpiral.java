public class ClockwiseSpiral{
	public static void main(String args[]){
		int a[][]={{1,2,3,4,5},
		    {6,7,8,9,10},
		    {11,12,13,14,15},
		    {16,17,18,19,20}};
		int rowstart=0;
		int rowend=a.length;
		int colstart=0;
		int colend=a[0].length;
	       while(rowstart < rowend && colstart <colend){
		   for(int i=colstart;i<colend;i++){
		       System.out.print(a[rowstart][i]+" ");
		   }
		   rowstart++;
		   for(int i=rowstart;i<rowend;i++){
		       System.out.print(a[i][colend-1]+" ");
		   }
		   colend--;
		   for(int i=colend-1;i>=colstart;i--){
		       System.out.print(a[rowend-1][i]+" ");
		   }
		   rowend--;
		   for(int i=rowend-1;i>=rowstart;i--){
		       System.out.print(a[i][colstart]+" ");
		   }
		   colstart++;
	       }
		
	     }    
    }
