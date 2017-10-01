package Event;

public enum Command {
	QLDSDHThem,QLDSDHSua,QLDSDHXoa,QLDSDHTimKiem,
	VShowFormThemMH,VShowFormSuaMH,CHandleXoaMH,CHandleTimKiemMH,
	Error,
	CQuanLyDSYC,CQuanLyDSDH,
	RThemYC,
	RXoaYC,
	RSuaMH,
	RTimKiemMH,
	RCapNhatDSMH,
	ChandleThemMH,
	ChandleSuaMH
	,;
	
	public static Command fromInteger(int x) {
        switch(x) {
        case 0:
            return QLDSDHThem;
        case 1:
            return QLDSDHSua;
        case 2:
        	return QLDSDHXoa;
        case 3:
        	return QLDSDHTimKiem;
        case 4:
            return VShowFormThemMH;
        case 5:
            return VShowFormSuaMH;
        case 6:
        	return CHandleXoaMH;
        case 7:
        	return CHandleTimKiemMH;
        case 8:
            return Error;
        case 9:
        	return CQuanLyDSYC;
        case 10:
        	return CQuanLyDSDH;
        case 11:
            return RThemYC;
        case 12:
        	return RXoaYC;
        case 13:
        	return RSuaMH;
        case 14:
        	return RTimKiemMH;
        case 15:
        	return RCapNhatDSMH;
        case 16:
        	return ChandleThemMH;
        case 17: 
        	return ChandleSuaMH;
        }
        
        return null;
    }
}
