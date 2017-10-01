package Factory;

import Controller.BaseController;
import Controller.SapXepYeuCauChucNangController;
//import Controller.QuanLyDSDHController;
//import Controller.QuanLyDSMHController;
import Event.Command;

public class QuanLyFactoryController extends FactoryController {

	@Override
	BaseController createController(Command type) {
		switch (type) {
		case CQuanLyDSYC:
			return new SapXepYeuCauChucNangController();
//		case CQuanLyDSDH:
//			return new QuanLyDSDHController();
		default:
			return null;
		}
		
	}

}
