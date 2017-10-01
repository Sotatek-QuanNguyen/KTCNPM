package Core;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public abstract class PanelThemSuaXoa extends BaseView {
	private JButton btnThem;
	private JButton btnSua;
	private JButton btnXoa;
	
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		btnThem = new JButton("Thêm");
		btnSua = new JButton("Sửa");
		btnXoa = new JButton("Xoá");
		
		add(btnThem);
		add(btnSua);
		add(btnXoa);
	
		btnThem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handleEventThem();
			}
		});
		btnSua.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handleEventSua();
			}
		});
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				handleEventXoa();
			}
		});
	}
	
	protected abstract void handleEventThem();
	protected abstract void handleEventSua();
	protected abstract void handleEventXoa();
	
}
