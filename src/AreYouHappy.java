import javax.swing.JOptionPane;

public class AreYouHappy {
	public static void main(String[] args) {
		int question1 = JOptionPane.showConfirmDialog(null, "Are you happy?");
		if (question1 == 0) {
			JOptionPane.showMessageDialog(null, "Well, keep doing whatever you're doing!");
		} else
		if (question1 == 1) {
			int question2 = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
			
			if (question2 == 0) {
				JOptionPane.showMessageDialog(null, "Change something!");
			} else
			if (question2 == 1) {
				JOptionPane.showMessageDialog(null, "Well, keep doing whatever you're doing.");
			}
		} else
		if (question1 == 2) {
			System.exit(0);
		}
	}
}
