package item17;

public class StringBuilder {
	private char[] value;
	private int size;
	private int index;
	
	StringBuilder(){
		size = 1;
		value = new char[size];
		index = 0;
	}
	
	public void append(String str) {
		if(str==null) str = "null";
		int len = str.length();
		ensureCapacity(len);//배열의 크기 확인하여 늘려주기
		for(int i=0;i<str.length();i++) {
			value[index++] = str.charAt(i);
		}
		System.out.println("추가후> "+ "size: "+size+" index: "+index);
	}

	//배열의 크기가 임계치를 넘어갔을때 길이 늘려줌
	private void ensureCapacity(int len) {
		if(index + len > size) {
			size = (size+len)*2;
			char[] newValue = new char[size];
			for(int i=0;i<value.length;i++) {
				newValue[i] = value[i];//새로운 배열에 복사
			}
			value = newValue;
		}
		System.out.println("배열크기 증가후>" +"size:"+size+" index: "+index);
	}
	
	public String toString() {
		return new String(value,0,index);
	}

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("one");
		sb.append("two");
		sb.append("eleven");
		sb.append("sdfkjsldjflsdjfs");
		System.out.println(sb.toString());

	}

}
