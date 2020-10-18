package myPackage;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame{
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JButton button = new JButton("hit me");
	
	/**
	 * initialize GUI
	 */
	public GUI () {
		init();
	}
	
	/**
	 * add elements to the GUI
	 */
	private void init() {
		label.setText("result to come");
		panel.add(label);
		panel.add(button);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.setSize(150,200);
		
	}
	
	/**
	 * add an action Listener to the button
	 * @param a
	 */
	public void addButtonListener(ActionListener a) {
		button.addActionListener(a);
	}

	public void setLabelText(String a) {
		label.setText("The result is " + a);
	}
}
