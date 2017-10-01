package View;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.table.DefaultTableModel;

import Core.BangDuLieu;
import Model.DanhSachYeuCau;
import Model.YeuCauChucNang;

public class BangDuLieuDanhSachYeuCau extends BangDuLieu<DanhSachYeuCau> {

	public void setInputData(DanhSachYeuCau data) {
		//headers for the table
        String[] columns = new String[] {
            "STT","Mô tả ","Phân Loại"
        };
        
        //actual data for the table in a 2d array

        ArrayList<YeuCauChucNang> listMH = data.getDsyc();
        
		DefaultTableModel model = new DefaultTableModel(columns,0);
		for (int i = 0; i < listMH.size(); i++) {
			int maMH = i;
			String mota = listMH.get(i).getMoTa();
			String loai = listMH.get(i).getLoai();
			Object[] dataMH = {maMH,mota,loai};
			model.addRow(dataMH);
		}
		setModel(model);
	}

}
