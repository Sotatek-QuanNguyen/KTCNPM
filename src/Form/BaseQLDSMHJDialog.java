package Form;

import javax.swing.JDialog;

import Event.Command;
import Event.Notifier;

public abstract class BaseQLDSMHJDialog extends JDialog {
	
	public BaseQLDSMHJDialog() {
		// TODO Auto-generated constructor stub
	}
	
	public Notifier notifier = Notifier.quanLyDSMHNotifier;
	public void notifyObserver(Command command, Object data) {
		notifier.notifyObserver(command.ordinal(), data);
	}
	
	public void showWindow(){
		this.setSize(700, 500);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setModal(true);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
}
