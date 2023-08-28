import javax. swing. *;
import javax.swing.JLayeredPane;
public class yummyMotto {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Guess a number between 1 and 10");
		JOptionPane.showMessageDialog(null, "The number is "+(1 + (int)(Math.random() * 10)));
	}

}