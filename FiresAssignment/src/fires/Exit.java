package fires;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;


import javax.swing.*;

public class Exit extends JFrame implements ActionListener{
	private JLabel lblque;
	private JButton btnyes;
	private JButton btnno;
	private JFrame frame = new JFrame("Quit?");
	private JPanel panel = new JPanel();
	public static void main(String[] args) {
		Exit appGui = new Exit();
	}
		public Exit() {
		
			panel.setLayout(new GridLayout(3,1,3,3));
			//Column then row
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			Container myWindow = getContentPane();
			myWindow.setLayout(new GridLayout());
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			lblque = new JLabel("Put Out Fire and Go Home?");
			lblque.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lblque.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lblque);
			panel.add(lblque);
	
			
	btnyes = new JButton("Yes");
	myWindow.add(btnyes);
	panel.add(btnyes);
	
	btnno = new JButton("No");
	myWindow.add(btnno);
	panel.add(btnno);
	
	btnno.addActionListener(this);
	btnyes.addActionListener(this);

	frame.add(panel);
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	frame.setSize(400,400);
	frame.setVisible(true);
		}
		
	 public void actionPerformed(ActionEvent e) {

			if (e.getSource() == btnyes) {
				  System.exit(0);
			}
			else if  (e.getSource() == btnno) {
			
				frame.dispose();
				frame.setVisible(false);
}
	 }
}