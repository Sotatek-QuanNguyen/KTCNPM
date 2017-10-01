package Controller;

import javax.swing.JPanel;

public abstract class BaseController<T> {
	public abstract boolean hienThiFormConfirm(String title, String message);
	public abstract void themItem(T item);
	public abstract void suaItem(T item);
	public abstract void xoaItem(T item);

}

