package serializable_field_Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		// Member 인스턴스 생성
		Member mem1 = new Member("홍길동", 20, "대전");
		Member mem2 = new Member("일지매", 30, "경기");
		Member mem3 = new Member("이몽룡", 40, "강원");
		Member mem4 = new Member("성춘향", 20, "제주");
		// 직렬화
		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Serial.txt"))) {

			// 파일에 t1 객체 출력
			out.writeObject(mem1);

		} catch (Exception e) {

			System.out.println("직렬화 실패~!");
		}

		// 역질렬화로 부활시킬 껍데기 인스턴스 생성
		Member p1 = null;

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("Serial.txt"))) {

			// 파일에서 t1으로 역직렬화 수행
			p1 = (Member) in.readObject();

		} catch (Exception e) {

			System.out.println("직렬화 실패~!");
		}

		// 역직렬화로 생성된 인스턴스 필드와 메소드 확인
		System.out.println(p1.name);//접근불가
		System.out.println(p1.age);//접근불가
		//private 인스턴스 필드들마저 API로 공개되는 꼴???????

	}

}
