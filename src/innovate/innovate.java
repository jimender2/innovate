package innovate;

import javax.swing.JOptionPane;

/**
 * @author Jonathan Meredith and Joseph Calbrese
 *
 */
public class innovate {

	public static void main(String[] args) {
		//Declare Variables here
		//Strings
		String input,
			field;
		
		//Integers
		int move;
		
		//Boolean
		boolean playGame;
		
		//Does the user want to play??
		playGame = false;
		do {
		input = JOptionPane.showInputDialog("Do you want to play the game?");
		
		input = input.toLowerCase();
		if(input.charAt(0) == 'y') {
			playGame = true;
		} else if (input.charAt(0) == 'n') {
			System.exit(0);
		} else {
			playGame = false;
		}
		
		} while (playGame == false);
	}

}
