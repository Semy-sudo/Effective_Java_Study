package instance0f;

public final class CaseInsensitiveString {
	private final String s;
	
	public CaseInsensitiveString(String s) {
		this.s = s;
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof CaseInsensitiveString) {
//			return s.equals(((CaseInsensitiveString)obj).s);
//		}
//		if(obj instanceof String) {
//			return s.equals((String)obj);
//		}
//		return false;
//	}
	
	//같은 클래스를 참조하는지 && 같은 값을 가지는지
	@Override
	public boolean equals(Object obj) {
		return obj instanceof CaseInsensitiveString && ((CaseInsensitiveString)obj).s.equalsIgnoreCase(s);
	}

}
