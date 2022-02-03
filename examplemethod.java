import java.io.IOException;
public class examplemethod {
	static String firstLetter(String word) {
		if(word.length() == 0) {
			return "";
		}
		return word.substring(0,1);
	}
	

	public static void main(String[] args) throws IOException {
		if(args.length ==  0) {
			System.out.println("no argument");
		}

		String firstLetterOfWord = examplemethod.firstLetter(args[0]);

		System.out.println(firstLetterOfWord);
		System.out.println("hello");
	}

	
}
