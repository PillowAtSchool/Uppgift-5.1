package bokuppgifter;

// Uppgift 5.1 sida 121

import javax.swing.JOptionPane;

public class Uppgift_5_1 {

	public static void main(String[] args) {

		int maxNum = Integer.MIN_VALUE;
		int minNum = Integer.MAX_VALUE;

		while (true) {

			String num = JOptionPane.showInputDialog("Skriv tal.");
			if (num == null)
				break;
			int number = Integer.parseInt(num);
			maxNum = Math.max(number, maxNum);
			minNum = Math.min(number, minNum);

		}

		JOptionPane.showMessageDialog(null, "Största nummer: " + maxNum + "\nMinsta nummer: " + minNum);

	}

}
