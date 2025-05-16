package javaChallenge;

public class HelloWordFindLenght {

	public static void main(String[] args) {
		// Declaring the String value
		String s = "Hello World";
		// creating the integer with a value = 0
		int count = 0;

		// getting into the for loop staring the value i=5
		for (int i = 5; i < s.length(); i++) {
			// creating a char ch to find the character in the world
			char ch = s.charAt(i);
			// creating the if condition to exclude space
			if (ch != ' ')
				// count the value of char in each loop with if condition
				count++;
		}
		System.out.println("Out put step 1 = " + count);

		
		
		// Step 2 for finding the count in World

		// Trim trailing spaces, then split the string by spaces
		String[] words = s.trim().split("\\s+");

		// Get the last word from the array
		String lastWord = words[words.length - 1];

		// Print length of the last word
		System.out.println("OutPut Step2 = " + lastWord.length());

		
		
		
		
		// finding the count in the word Moon

		// declaring the String value
		String m = "Fly me to the Moon";
		// Spiting the word by space
		String[] word = m.trim().split("\\s+");
		// getting to the last word of the array
		String lword = word[word.length - 1];
		// printing the length last word
		System.out.println("Output moon = " + lword.length());

		
		
		
		
		// finding the count in the word Moon

		// declaring the String value
		String j = "luffy is still joyboy";
		// Spiting the word by space
		String[] jword = j.split("\\s+");
		// getting to the last word of the array
		String jlword = jword[jword.length - 1];
		// printing the length last word
		System.out.println("Output joybot = " + jlword.length());
	}

}
