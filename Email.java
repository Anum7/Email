import javax.swing.JFrame;
public class Email {
	
	public static void main(String[] args){
		JFrame frame = new JFrame("Compose email");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		
		EmailPanel panel = new EmailPanel();
		frame.getContentPane().add(panel);
		
		frame.pack();
		frame.setVisible(true);
	}
}
