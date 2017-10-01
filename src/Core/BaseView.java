package Core;

import javax.swing.JPanel;

import Event.Command;
import Event.Notifier;
import Event.Observer;

public abstract class BaseView extends JPanel{
	public Notifier notifier = Notifier.quanLyDSMHNotifier;
	public void notifyObserver(Command command, Object data) {
		notifier.notifyObserver(command.ordinal(), data);
	}
	
	protected abstract void setup();
}
