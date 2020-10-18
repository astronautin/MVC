import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {

	private GUI gui = new GUI();
	private Model model = new Model();
	
	public Controller(GUI gui, Model model) {
		this.gui = gui;
		this.model = model;
		
		this.gui.addButtonListener(new ButtonListener());
	}
	
	
	
	class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			gui.setLabelText(Integer.toString(model.add2NUmbers()));
		}
	}
}
