package Core;

import javax.swing.JPanel;

import Event.Command;
import Event.Notifier;
import Event.Observer;
import Factory.FactoryController;
import Factory.QuanLyFactoryController;

public class BaseViewController extends JPanel implements Observer {
	public FactoryController quanLyControler = new QuanLyFactoryController();
	public Notifier notifier = Notifier.quanLyDSMHNotifier;
	public void notifyObserver(Command command, Object data) {
		notifier.notifyObserver(command.ordinal(), data);
	}
	
	@Override
	public void update(int command, Object data) {
		// TODO Auto-generated method stub
		this.update(Command.fromInteger(command), data);
	}
	
	public void addObserver(Observer observer) {
		notifier.addObserver(observer);
	}
	
	public void update(Command command, Object data) {
		
	}
	
	public void removeObserver(Observer observer) {
		notifier.removeObserver(observer);
	}
}
