import java.util.*;


public class Main {

	static HashMap<String, String> dictionary = new HashMap<>();
	public static void main(String[] args) {
		buildDictionary();
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		
		while(!word.equals("TTYL")) {
			String newWord = translate(word);
			System.out.println(newWord);
			word = sc.nextLine();
		}
		System.out.println("talk to you later");
	}
	
	private static String translate(String oldWord) {
		if (dictionary.containsKey(oldWord)) {
			return dictionary.get(oldWord);
		}
		return oldWord;
		
	}

	private static void buildDictionary() {
		dictionary.put("CU", "see you");
		dictionary.put(":=)", "I'm happy");
		dictionary.put(":=(", "I'm unhappy");
		dictionary.put(";=)", "wink");
		dictionary.put(":=P", "stick out my tongue");
		dictionary.put("(~.~)", "sleepy");
		dictionary.put("TA", "totally awesome");
		dictionary.put("CCC", "Canadian Computing Competition");
		dictionary.put("CUZ", "because");
		dictionary.put("TY", "thank-you");
		dictionary.put("YW", "you're welcome");
		
	}

}
