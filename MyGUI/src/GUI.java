import java.awt.event.ActionListener;

import javax.swing.*;

public class GUI extends JFrame{
	
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JLabel label = new JLabel();
	private JButton button = new JButton("hit me");
	
	public GUI () {
		init();
	}
	
	private void init() {
		panel.add(label);
		panel.add(button);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		
	}
	
	public void addButtonListener(ActionListener a) {
		button.addActionListener(a);
	}

	public void setLabelText(String a) {
		label.setText(a);
	}
}
