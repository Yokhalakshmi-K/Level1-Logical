public class Paranthesis{
	public static void main(String[] args){
		String expression="{[()]}";
		boolean isValid=isValidExpression(expression);
		System.out.println(isValid);
	}
	public static boolean isValidExpression(String expression){
		int countcurly=0,countSquare=0,countRound=0;
		for(int i=0;i<expression.length();i++){
			if(expression.charAt(i)=='{'){
				countcurly++;
			}else if(expression.charAt(i)=='}'){
				countcurly--;
			}else if(expression.charAt(i)=='['){
				countSquare++;
			}else if(expression.charAt(i)==']'){
				countSquare--;
			}else if(expression.charAt(i)=='('){
				countRound++;
			}else if(expression.charAt(i)==')'){
				countRound--;
			}
		}
		return countcurly==0 && countSquare==0 && countRound==0;
	}
}
