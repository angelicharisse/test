

//import org.apache.commons.lang3.text.WordUtils;

public class Capital {

	
 public static void main(String args[])
 {
	 String sent = new String("hello world javaScript language a letter1st thing ");
	 String words[] = sent.split("\\s+");
	 for (String word : words) {
		    System.out.println(word.substring(0, 1).toUpperCase() + word.substring(1));
		}
	 
	
	// System.out.println(WordUtils.capitalize(sample));
 }
 
}
