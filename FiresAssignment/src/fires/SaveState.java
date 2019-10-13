	package fires;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaveState  extends JFrame {
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JTextField filename = new JTextField(), dir = new JTextField();

	  private JButton save = new JButton("Save");

	  public SaveState() {
	    JPanel p = new JPanel();

	    save.addActionListener(new SaveL());
	    p.add(save);
	    Container cp = getContentPane();
	    cp.add(p, BorderLayout.SOUTH);
	    dir.setEditable(false);
	    filename.setEditable(false);
	    p = new JPanel();
	    p.setLayout(new GridLayout(2, 1));
	    p.add(filename);
	    p.add(dir);
	    cp.add(p, BorderLayout.NORTH);
	  }

	
	  class SaveL implements ActionListener {
	    public void actionPerformed(ActionEvent e) {
	      JFileChooser c = new JFileChooser();
	      // Demonstrate "Save" dialog:
	      int rVal = c.showSaveDialog(SaveState.this);
	      if (rVal == JFileChooser.APPROVE_OPTION) {
	        filename.setText(c.getSelectedFile().getName());
	        dir.setText(c.getCurrentDirectory().toString());
	      }
	      if (rVal == JFileChooser.CANCEL_OPTION) {
	        filename.setText("You pressed cancel");
	        dir.setText("");
	      }
	    }
	  }

	  public static void main(String[] args) {
	    run(new SaveState(), 250, 110);
	  }

	  public static void run(JFrame frame, int width, int height) {
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(width, height);
	    frame.setVisible(true);
	  }
	}