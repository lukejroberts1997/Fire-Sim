package fires;


import java.awt.Container;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

class Properties extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel lbltitle2;
	private JLabel lblblank;
	private JButton btncont;
	private JSlider slifuel;
	private JLabel lblfuelind;
	private JSlider slipoke;
	private JSlider slimarsh;
	private JLabel lblmarshind;
	private JLabel lblpokeind;
	private JFrame frame = new JFrame("Fire Simulation");
	private JPanel panel = new JPanel();
 

	
	
	public static void main(String[] args) {

	}
		public Properties() {

			
			panel.setLayout(new GridLayout(11,1,3,3));
			//Column then row
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
			Container myWindow = getContentPane();
			myWindow.setLayout(new GridLayout());
			
			
			lbltitle2 = new JLabel("Fire Simulation");
			lbltitle2.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lbltitle2.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lbltitle2);
			panel.add(lbltitle2);
			
			lblblank = new JLabel("   ");
			lblblank.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lblblank.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lblblank);
			panel.add(lblblank);
			
			
					
			slifuel = new JSlider(JSlider.HORIZONTAL,0,10,1);		
			myWindow.add(slifuel);
			panel.add(slifuel);
			slifuel.setMinorTickSpacing(1);
			slifuel.setPaintTicks(true);
			slifuel.setPaintLabels(true);
			
			lblfuelind = new JLabel("Fuel Amount: 1");
			lblfuelind.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblfuelind);
			panel.add(lblfuelind);
			
			
			lblblank = new JLabel("   ");
			lblblank.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lblblank.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lblblank);
			panel.add(lblblank);
			
			
			
			slimarsh = new JSlider(JSlider.HORIZONTAL,0,10,1);		
			myWindow.add(slimarsh);
			panel.add(slimarsh);
			slimarsh.setMinorTickSpacing(1);
			slimarsh.setPaintTicks(true);
			slimarsh.setPaintLabels(true);
			
			lblmarshind = new JLabel("Marshmallows: 1");
			lblmarshind.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblmarshind);
			panel.add(lblmarshind);
			
			lblblank = new JLabel("   ");
			lblblank.setFont(new Font("Sans Serif", Font.BOLD, 24));
			lblblank.setHorizontalAlignment( SwingConstants.CENTER );
			myWindow.add(lblblank);
			panel.add(lblblank);	
			
			
			
			slipoke = new JSlider(JSlider.HORIZONTAL,0,10,1);		
			myWindow.add(slipoke);
			panel.add(slipoke);
			slipoke.setMinorTickSpacing(1);
			slipoke.setPaintTicks(true);
			slipoke.setPaintLabels(true);
			
			lblpokeind = new JLabel("Poke Amount: 1");
			lblpokeind.setHorizontalAlignment( SwingConstants.CENTER);
			myWindow.add(lblpokeind);
			panel.add(lblpokeind);
			

			
			btncont = new JButton("Continue");
			myWindow.add(btncont);
			panel.add(btncont);
			
			event e = new event ();
			slifuel.addChangeListener(e);
			slimarsh.addChangeListener(e);
			slipoke.addChangeListener(e);
			

	frame.add(panel);
			
			frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			frame.setSize(400,400);
			frame.setVisible(true);
			
			btncont.addActionListener(this);
		

			
			

}
		public class event implements ChangeListener {
			public void stateChanged (ChangeEvent e) {
			int value = slifuel.getValue();
			lblfuelind.setText("Fuel Amount: " +value);
			
			
			
			int value1 = slimarsh.getValue();
			lblmarshind.setText("Marshmallows: " +value1);
			
			int value2 = slipoke.getValue();
			lblpokeind.setText("Poke Amount: " +value2);
		}


		}
		@Override
		public void actionPerformed(ActionEvent e) {
		
		
			if   (e.getSource() == btncont) {
				FireSim2 fr=new FireSim2() ;
				fr.setVisible(false);
				fr.setSize(400,400);
				dispose();
		}
			
		}}