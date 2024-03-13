import java.util.*;
public class ReverseWord{
	public static void main(String[] args){
		char ch[]={'I',' ','l','i','k','e',' ','j','a','v','a'};
		reverseWord(ch);
		System.out.println("Reverse string is: "+new String(ch));
	}
	static void reverseCharacter(char ch[],int left,int right){
		while(left<right){
			char temp=ch[left];
			ch[left]=ch[right];
			ch[right]=temp;
			left++;
			right--;
		}
	}
	public static void reverseWord(char[] ch){
		reverseCharacter(ch,0,ch.length-1);
		int start=0;
		for(int end=0;end<ch.length;end++){
			if(ch[end]==' '){
				reverseCharacter(ch,start,end-1);
				start=end+1;
			} else if(end==ch.length-1) {
				reverseCharacter(ch,start,end);
			}
		}
	}
}
