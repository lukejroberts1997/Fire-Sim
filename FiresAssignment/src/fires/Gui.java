package fires;

import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Gui extends JFrame implements ActionListener {
	private JLabel lbltitle;
	private JButton btnstartfire;
	private JButton btngohome; 
	private JButton btnloadfire;
	private JFrame frame = new JFrame("Fire Simulation");
	private JPanel panel = new JPanel();
	
	public static void main(String[] args) {
		Gui appGui = new Gui();
	}
		public Gui() {
			
			panel.setLayout(new GridLayout(4,1,3,3));
			//collumn then row
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			Container myWindow = getContentPane();
			myWindow.setLayout(new GridLayout());
			
			
			lbltitle = new JLabel("Fire Simulation");
			lbltitle.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lbltitle.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lbltitle);
			panel.add(lbltitle);
			
			
			
			btnstartfire = new JButton("Start New Fire");
			myWindow.add(btnstartfire);
			panel.add(btnstartfire);
			
			btngohome = new JButton("Go Home");
			myWindow.add(btngohome);
			panel.add(btngohome);
			
			btnloadfire = new JButton("Load Fire");
			myWindow.add(btnloadfire);
			panel.add(btnloadfire);
			
			frame.add(panel);
			
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			frame.setSize(400,400);
			frame.setVisible(true);
			
			btngohome.addActionListener(this);
			btnstartfire.addActionListener(this);
			btnloadfire.addActionListener(this);
			

			
			
		}
		
		

		public void actionPerformed(ActionEvent e) {

			if   (e.getSource() == btngohome) {
				Exit frame=new Exit () ;
				frame.setVisible(false);
				frame.setSize(400,400);
			frame.setTitle("Quit?");
		
			}
			else if  (e.getSource() == btnstartfire) {
				Properties frame=new Properties () ;
				frame.setVisible(false);
				frame.setSize(400,400);
			dispose();
			}
			else if (e.getSource() == btnloadfire) {
				LoadState frame=new LoadState();
				frame.setSize(400,400);
				frame.setVisible(true);
			}
			}
	}


