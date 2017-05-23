import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmailPanel extends JPanel{
	
	private JLabel ToLabel, CcLabel, BccLabel, SubLabel, MessLabel;
	private JTextField ToField, CcField, BccField, SubField, MessField;
	private JButton send; 

	public EmailPanel(){
		ToLabel = new JLabel("To: ");
		CcLabel = new JLabel("Cc: ");
		BccLabel = new JLabel("Bcc:");
		SubLabel = new JLabel("Subject: ");
		MessLabel = new JLabel("Message: ");
		send = new JButton("Send");
		ToField = new JTextField();
		CcField = new JTextField();
		BccField = new JTextField();
		SubField = new JTextField();
		MessField = new JTextField();
		add(ToLabel);
		add(ToField);
		add(CcLabel);
		add(CcField);
		add(BccLabel);
		add(BccField);
		add(SubLabel);
		add(SubField);
		add(MessLabel);
		add(MessField);
		add(send);
		

		send.addActionListener(new TempListener());
		
		setLayout(new GridLayout(9, 2));
		setPreferredSize(new Dimension(400, 300));
		setBackground(Color.orange);
		
		}
			
		private class TempListener implements ActionListener
		{
			public void actionPerformed(ActionEvent event){
				
				String Totext = "To: " + ToField.getText() + "\nCc: " +  CcField.getText() + "\nBcc: " + 
						BccField.getText() + "\nSubject: " + SubField.getText() + "\nMessage: " + MessField.getText();
				System.out.println(Totext);
			}
		}
	}




