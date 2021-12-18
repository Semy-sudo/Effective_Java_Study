package Encapsulation;

public class Programmer {
	private String name;//private 접근 제한자로 은닉화. 
	private String blog;
	
	//변수에 접근하기 위해 메소드를 사용
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBlog(String blog) {
		this.blog = blog;
	}
	
	public String getName() {
		return name;
	}
	
	public String getBlog() {
		return blog;
	}

}
