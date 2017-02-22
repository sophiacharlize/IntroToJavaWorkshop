package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: 
 * Have the kids play with the Speak & Spell. 
 * The first Speak & Spell was introduced at the summer Consumer Electronics Show in June 1978, making it 
 * one of the earliest handheld electronic devices with a visual display to use interchangeable game cartridges. 
 * Discuss with students how you would make this program. 
 * Allow them to code it themselves, or use this recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
		speak ("spell the word elephant");
            
		// 2. Catch the user's answer in a String
		String word= JOptionPane.showInputDialog("Type the word here");

		// 3. If the user spelled the word correctly, speak "correct"
		if(word.equals("elephant")) {
			speak ("correct");
		}

		// 4. Otherwise say "wrong"
		else{
			speak("incorrect");
		}

		// 5. repeat the process for other words
		speak ("spell the word gigantic");
		String word1= JOptionPane.showInputDialog("Type word here");
		if(word1.equals("gigantic")) {
			speak ("correct");
		}
			else{
				speak("incorrect");
			}
		speak ("spell the word xylophone");
		String word2 = JOptionPane.showInputDialog("Type word here");
		if(word2.equals("xylophone")) {
			speak ("correct");
			
		}
		else {
			speak ("incorrect");
		}
		
		speak("spell the word logorrhea");
				String word3 = JOptionPane.showInputDialog("Type word here");
				if (word3.equals("logorrhea")) {
					speak ("correct"); 
				}
				else {
					speak ("incorrect");
				}
		}
		
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}


