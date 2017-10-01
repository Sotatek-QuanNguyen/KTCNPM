package Core;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import Controller.BaseController;
import Event.Command;
import View.PanelInput;

/**
 * @param <T> Data Type transfered between FormTimKiem and BangDuLieu
 */
public abstract class PanelQuanLy<T> extends BaseViewController {
	private JLabel title;
	protected BangDuLieu<T> bang;
	protected PanelThemSuaXoa quanLyView;
	protected PanelInput inputContent;
	public void setQuanLyView(PanelThemSuaXoa quanLyView) {
		this.quanLyView = quanLyView;
	}
	
	public void setInputContent(PanelInput inputContent) {
		this.inputContent = inputContent;
	}
	
	public void setBang(BangDuLieu bang) {
		this.bang = bang;
	}
	
	protected void setup() {
		this.setLayout(new BorderLayout());
		notifier.addObserver(this);
		title = new JLabel();
//		add(title,BorderLayout.NORTH);
		
		if (bang!=null && quanLyView != null && inputContent != null){
			add(inputContent, BorderLayout.NORTH);
			add(new JScrollPane(bang),BorderLayout.CENTER);
			add(quanLyView, BorderLayout.SOUTH);
			
		}

	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		switch (command) {
		case Error:
			JOptionPane.showMessageDialog(null,"Error!");
			break;
		
		default:
			super.update(command, data);
			break;
		}
		
	}

	public void setTitle(String title){
		this.title.setText(title);
	}
}
