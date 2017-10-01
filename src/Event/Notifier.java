package Event;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Notifier {
	
	public static Notifier quanLyDSMHNotifier = Notifier.instance("QuanLyDanhSachMatHang");
	
	static Map<String, Notifier> instances = new HashMap<String, Notifier>();
	ArrayList<Observer> observers = new ArrayList<Observer>();
	public static Notifier instance(String name) {
		if(instances == null) {
			instances = new HashMap<String, Notifier>();
		}
		Notifier instance;
		if (instances.containsKey(name)) {
			instance = instances.get(name);
		} else {
			instance = new Notifier();
			instances.put(name, instance);
		}
		return instance;
	}
	
	public void addObserver(Observer observer) {
		if (!observers.contains(observer)) {
			observers.add(observer);
		}
	}
	
	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}
	
	public void notifyObserver(int command, Object data) {
		for (int i = 0; i < observers.size(); i++) {
			observers.get(i).update(command, data);
		}
	}
	
};