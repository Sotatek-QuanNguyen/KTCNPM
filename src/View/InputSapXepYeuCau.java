package View;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputSapXepYeuCau extends PanelInput{
	private JTextField fMota;
	private JTextField fPhanLoai;
	public InputSapXepYeuCau() {
		// TODO Auto-generated constructor stub
		this.setup();
	}
	public JTextField getfMota() {
		return fMota;
	}
	public void setfMota(JTextField fMota) {
		this.fMota = fMota;
	}
	public JTextField getfPhanLoai() {
		return fPhanLoai;
	}
	public void setfPhanLoai(JTextField fPhanLoai) {
		this.fPhanLoai = fPhanLoai;
	}
	@Override
	protected void setup() {
		// TODO Auto-generated method stub
		super.setup();
		// TODO Auto-generated method stub
		JLabel motaLabel = new JLabel("Mo Ta");
		fMota = new JTextField(20);
		JLabel phanloaiLabel = new JLabel("Phan Loai");
		fPhanLoai = new JTextField(20);
		add(motaLabel);
		add(fMota);
		add(phanloaiLabel);
		add(fPhanLoai);
	}
}
