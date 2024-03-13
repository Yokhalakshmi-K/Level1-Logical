public class ClosingParenthesisIndex{
	public static void main(String[] args){
		String str="Sometimes (when I nest them (my parentheticals) too much (like this (and this))) they get confusing.";
		int openingParenthesis=10;
		int closingParenthesis=findClosingParenthesis(str,openingParenthesis);
		System.out.println(closingParenthesis);
	}
	public static int findClosingParenthesis(String str,int openingParenthesis){
		if(str==null || openingParenthesis<0 || openingParenthesis>=str.length()){
			return -1;
		}
		int count=0;
		for(int i=openingParenthesis;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch == '('){
				count++;
			}else if(ch==')'){
				count--;
				if(count==0){
					return i;
				}
			}
		}
		return -1;
	}
}
