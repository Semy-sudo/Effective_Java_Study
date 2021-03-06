package BuilderPattern2;

public class Main {

	public static void main(String[] args) {
		//Computer computer = new Computer("","","");

		
		//computer 객체를 computerbuilder 를 통해서 만든다
		//클라이언트 코드 - 생성, computerbuilder - 복잡한 객체 값 설정 분리
		Computer computer = ComputerBuilder
				.start()
				.setCpu("i7")
				.setRam("8G")
				.setStorage("256 SSD")
				.build();
		
		computer = ComputerBuilder
				.start()
				.setCpu("i9")
				.setRam("8G")
				.setStorage("256 SSD")
				.build();
		
		System.out.println(computer.toString());
	}

}
