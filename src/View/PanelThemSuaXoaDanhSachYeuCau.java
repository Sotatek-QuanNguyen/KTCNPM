package View;

import Core.PanelThemSuaXoa;
import Event.Command;

public class PanelThemSuaXoaDanhSachYeuCau extends PanelThemSuaXoa{
	
	public PanelThemSuaXoaDanhSachYeuCau() {
		// TODO Auto-generated constructor stub
		super.setup();
	}

	@Override
	protected void handleEventThem() {
		// TODO Auto-generated method stub
		notifyObserver(Command.RThemYC,null);
	}

	@Override
	protected void handleEventSua() {
		// TODO Auto-generated method stub
		notifyObserver(Command.VShowFormSuaMH, null);

	}

	@Override
	protected void handleEventXoa() {
		// TODO Auto-generated method stub
		notifyObserver(Command.CHandleXoaMH, null);
	}
}
