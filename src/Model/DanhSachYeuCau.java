package Model;

import java.util.ArrayList;
public class DanhSachYeuCau {
	public ArrayList<YeuCauChucNang> dsyc;
	public DanhSachYeuCau() {
		// TODO Auto-generated constructor stub
		dsyc = new ArrayList<YeuCauChucNang>();
	}
	public ArrayList<YeuCauChucNang> getDsyc() {
		return dsyc;
	}
	public void setDsyc(ArrayList<YeuCauChucNang> dsyc) {
		this.dsyc = dsyc;
	}
}
