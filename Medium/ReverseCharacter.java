import java.util.*;
public class ReverseCharacter{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no.of characters");
		int n=sc.nextInt();
		System.out.println("Enter the characters");
		char ch[]=new char[n];
		for(int i=0;i<n;i++){
			ch[i]=sc.next().charAt(0);
		}
		reverse(ch);
		System.out.println("Reversed characters: "+new String(ch));
	}
	static void reverse(char[] ch){
		int left=0;
		int right=ch.length-1;
		while(left<right){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			
			left++;
			right--;
		}
	}
}
