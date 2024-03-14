/*1. Given a mapping of digits to letters (as in a phone number), and a digit string, return
all possible letters the number could represent. You can assume each valid number in
the mapping is a single digit. For example if {“2”: [“a”, “b”, “c”], 3: [“d”, “e”, “f”], …} then
“23” should return [“ad”, “ae”, “af”, “bd”, “be”, “bf”, “cd”, “ce”, “cf"].*/


public class LetterCombination{
	public static void main(String[] args){
		String digits="73";
		String result[]=letterCombination(digits);
		System.out.println("The combinations are:");
		for(String combination:result){
			System.out.print(combination+" ");
		}
	}
	public static String[] letterCombination(String digits){
		if(digits == null || digits.length()==0)
			return new String[0];
		String mapping[]={"0","1","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		String[] result={""};
		for(int i=0;i<digits.length();i++){
			int digit=Character.getNumericValue(digits.charAt(i));
			String[] temp=new String[result.length*mapping[digit].length()];
			int index=0;
			for(String combination:result){
				String letter=mapping[digit];
				for(int j=0;j<letter.length();j++){
					temp[index++]=combination + letter.charAt(j);
				}
			}
			result=temp;
		}
		return result;
	}
}
