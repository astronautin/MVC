import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private GUI gui = new GUI();
	
	public Controller(GUI gui) {
		this.gui = gui;
		
		this.gui.addButtonListener(new ButtonListener());
	}
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			gui.setLabelText("you hit me...");
		}
	}
}
