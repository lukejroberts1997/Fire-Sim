package fires;

import java.awt.event.ActionListener;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;


import javax.swing.*;

public class FireSim2 extends JFrame implements ActionListener{

	private JButton btnstart;
	private JButton btnquit;
	private JLabel lblfuel;
	private JLabel lbltoast;
	private JLabel lblpoke;
	private JLabel lbllit;
	private JLabel lblblank;
	private JButton btnaddfuel;
	private JButton btntoast;
	private JButton btnpoke;
	private JButton btnsavefire;

	
	
	
	private JFrame frame = new JFrame("Fire Simulation");
	private JPanel panel = new JPanel();
	public static void main(String[] args) {
		Exit appGui = new Exit();
	}
		public FireSim2() {
		
			panel.setLayout(new GridLayout(3,1,3,3));
			//Column then row
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			Container myWindow = getContentPane();
			myWindow.setLayout(new GridLayout());
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
	
			btnaddfuel = new JButton("Add Fuel");
			myWindow.add(btnaddfuel);
			panel.add(btnaddfuel);
			
			lblfuel = new JLabel ("Fuel Amount: 0");
			lblfuel.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblfuel);
			panel.add(lblfuel);
			
			btntoast = new JButton("Toast Marshmallow");
			myWindow.add(btntoast);
			panel.add(btntoast);
			
			lbltoast = new JLabel ("Marshmallow Amount: 0");
			lbltoast.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lbltoast);
			panel.add(lbltoast);
			
			btnpoke = new JButton("Poke Fire");
			myWindow.add(btnpoke);
			panel.add(btnpoke);
			
			lblpoke = new JLabel ("Poke Amount: 0");
			lblpoke.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblpoke);
			panel.add(lblpoke);
			
			btnstart = new JButton("Start Fire");
			myWindow.add(btnstart);
			panel.add(btnstart);
			
			lbllit = new JLabel ("Fire Is not Lit");
			lbllit.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lbllit);
			panel.add(lbllit);
			
			btnsavefire = new JButton("Save Fire");
			myWindow.add(btnsavefire);
			panel.add(btnsavefire);
			
			lblblank = new JLabel ("  ");
			lblblank.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblblank);
			panel.add(lblblank);
			
			btnquit = new JButton("Extinguish");
			myWindow.add(btnquit);
			panel.add(btnquit);
			
			lblblank = new JLabel ("  ");
			lbllit.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblblank);
			panel.add(lblblank);

	
	btnquit.addActionListener(this);
	btnstart.addActionListener(this);
	btnpoke.addActionListener(this);
	btnaddfuel.addActionListener(this);
	btntoast.addActionListener(this);
	btnsavefire.addActionListener(this);
	
	
	
	frame.add(panel);
	
	frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
	frame.setSize(800,600);
	frame.setVisible(true);
		}
		
	

			public void actionPerformed(ActionEvent e) {
				
				
				if (e.getSource() == btnquit) {
					Exit fr=new Exit () ;
					fr.setVisible(true);
					fr.setSize(400,400);
				fr.setTitle("Quit?");
			fr.setVisible(false);
				}
				else if (e.getSource() == btnsavefire) {
					SaveState fr=new SaveState();
					fr.setSize(400,400);
					fr.setVisible(true);
				}
				else if (e.getSource() == btnaddfuel) {
					JOptionPane.showMessageDialog(frame,
						    "Fuel added! The temperature has increased by 100°C");
					
				}
				else if (e.getSource() == btntoast) {
					JOptionPane.showMessageDialog(frame,
						    "You toasted a marshmallow!\n"
						    + "You ate it and it was really good.\n");
						   
				}
				else if (e.getSource() == btnpoke) {
					JOptionPane.showMessageDialog(frame,
						    "You have poked the fire!\n"
						    + "The fire igntion time has been increased by 30 seconds\n");
						    
				}
				else if (e.getSource() == btnstart) {
					JOptionPane.showMessageDialog(frame,
						   "You started the fire!"); 
				}
				
				
			}
	}
