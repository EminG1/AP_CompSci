/*
   * Author:
   * Date:
   * Collaborator(s):
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    
    System.out.println("Please enter a sentence: ");
    String sentence = sc.nextLine();

	while(true){
		if(sentence.indexOf(" ") ==-1){
				System.out.print(pigLatin(sentence)+ " ");
				break;
			}
			int space = sentence.indexOf(" ");
			String word = sentence.substring(0, space);
			System.out.print(pigLatin(word)+ " ");
			
			sentence = sentence.substring(space+1);
			
		}
	}
	public static String pigLatin(String sentence){
	String result = "";
	String letter1 = "";
	String letter2 = "";
	String word = "";

	if(sentence.contains(" ") && sentence.length()>2){
	letter1=sentence.substring(0,1);
	letter2=sentence.substring(1,2);
	int space = word.indexOf(" ");
	word=sentence.substring(0,space);
	}
	
	else if(sentence.length()==1){
		letter1 = word;
	}
	
	else if(!(sentence.contains(" ")) && sentence.length()>2){
	letter1=sentence.substring(0,1);
	letter2=sentence.substring(1,2);
	word = sentence;
	}
	if("aeiou".contains(letter1.toLowerCase())&&sentence.length()==1){
		result = sentence +"-way";
	}
	else if("aeiou".contains(letter1.toLowerCase())){
		result = result + word +"-way";
	}
	else if("aeiou".contains(letter2.toLowerCase())){
		word = word.substring(0,word.length());
		result = result + "ay-"+word + letter1; 
	}
	if("abcdefghijklmnopqrstuvwxyz".contains(letter1.toLowerCase()) && !"aeiou".contains(letter1.toLowerCase())){
		word=word.substring(2,word.length());
		result=word+"-"+letter1+letter2+"ay";
	}
	
	return result;
}
	

}