//Thomas Judge Jr 
// SSE 550
// this is a program to guess a random number and the answer will show in a dialogue box. 
package ch1;
import javax. swing. *;
import javax.swing.JLayeredPane;
public class guessG {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Guess a number between 1 and 10");
		JOptionPane.showMessageDialog(null, "The number is "+(1 + (int)(Math.random() * 10)));
	}

}
