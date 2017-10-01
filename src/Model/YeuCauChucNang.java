package Model;

public class YeuCauChucNang {
	private String moTa;
	private String loai;
	
	public YeuCauChucNang(String moTa, String loai) {
		super();
		this.moTa = moTa;
		this.loai = loai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getLoai() {
		return loai;
	}
	public void setLoai(String loai) {
		this.loai = loai;
	}
}
