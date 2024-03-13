import java.util.Scanner;

public class WordMatrix{

	public static void main(String[] args){
	
		Scanner sc=new Scanner(System.in);
		char[][] matrix={{'F','A','C','I'},
		          	{'O','B','Q','P'},
		           	{'A','N','O','B'},
		            	{'M','A','S','S'}	};
		String str=sc.next().toUpperCase();
		int row=matrix.length;
		int col=matrix[0].length;
		boolean flag=false;
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				if(j+str.length()-1 < col){      // check the string in horizontal position
				
				StringBuilder hori=new StringBuilder();
				for(int k=0;k<str.length();k++){
				
					hori.append(matrix[i][j+k]);
				
				}
				if(hori.toString().equals(str))
				
					flag=true;	
					
				}
				if(i+str.length()-1 < row){      // check the string in vertical position
				
				StringBuilder vertical=new StringBuilder();
				for(int k=0;k<str.length();k++){
				
					vertical.append(matrix[i+k][j]);
				
				}
				if(vertical.toString().equals(str))
				
					flag=true;	
					
				}
			
			}
		
		}
		if(flag)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
