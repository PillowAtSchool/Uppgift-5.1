package bokuppgifter;

// Uppgift 5.1 sida 121

import javax.swing.JOptionPane;

public class Uppgift_5_1 {

	public static void main(String[] args) {

		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		while (true) {

			String number = JOptionPane.showInputDialog("Skriv tal.");
			if (number == null)
				break;
			int num = Integer.parseInt(number);
			maxNum = Math.max(num, maxNum);
			minNum = Math.min(num, minNum);

		}

		JOptionPane.showMessageDialog(null, "Största nummer: " + maxNum + "\nMinsta nummer: " + minNum);

	}

}
