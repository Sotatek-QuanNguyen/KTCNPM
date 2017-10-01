package View;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;

import Controller.BaseController;
import Core.PanelQuanLy;
import Event.Command;
import Model.DanhSachYeuCau;
import Model.YeuCauChucNang;

public class PanelSapXepThuTuUuTien extends PanelQuanLy<DanhSachYeuCau> {
	
	protected BaseController<YeuCauChucNang> controller;
	protected DanhSachYeuCau dsyc;
	public PanelSapXepThuTuUuTien() {
		controller =  quanLyControler.takeConstroller(Command.CQuanLyDSYC);
		dsyc = new DanhSachYeuCau();
		setQuanLyView(new PanelThemSuaXoaDanhSachYeuCau());
		setBang(new BangDuLieuDanhSachYeuCau());
		setInputContent(new InputSapXepYeuCau());
		setup();
		setTitle("QUAN LY DANH SACH MAT HANG");
		
	}
	@Override
	public void update(Command command, Object data) {
		// TODO Auto-generated method stub
		super.update(command, data);
		switch (command) {
		case RThemYC:
			
			String moTa = ((InputSapXepYeuCau) inputContent).getfMota().getText();
			String loai = ((InputSapXepYeuCau) inputContent).getfPhanLoai().getText();
			YeuCauChucNang yccn = new YeuCauChucNang(moTa, loai);
			dsyc.dsyc.add(yccn);
			capNhatDSMH(dsyc);
			break;

		default:
			break;
		}
	}
	
	private void capNhatDSMH(Object data) {
		// TODO Auto-generated method stub
		((BangDuLieuDanhSachYeuCau)bang).setInputData((DanhSachYeuCau)data);
	}
	
}
