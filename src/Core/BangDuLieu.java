package Core;

import javax.swing.JTable;

public abstract class BangDuLieu<T> extends JTable{
	protected abstract void setInputData(T data);
}
