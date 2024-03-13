/*Write a Java program to find the duplicate values of an array of string values.*/

public class FindDuplicateString{
	public static void main(String[] args){
		String[] arr={"apple","ant","egg","ant","apple","doll","cat"};
		int n=arr.length;
		System.out.println("Duplicate strings are:");
		boolean[] visited=new boolean[n];
		for(int i=0;i<n-1;i++){
			if(!visited[i]){
				boolean isDuplicate=false;
				for(int j=i+1;j<n;j++){
					if(arr[i].equals(arr[j])){
							isDuplicate=true;
							visited[j]=true;					
					}
				}
				if(isDuplicate){
					System.out.println(arr[i]+" ");
				}
			}
		}
	}
}
