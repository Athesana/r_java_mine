package com.kh.chap3.assiststream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.kh.chap3.assiststream.model.vo.Member;

public class D_ObjectStream {

	public void fileSave() {
		Member member = new Member("islee", "1234", "이산아", 20, 'F');
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e_object.dat"));) {
			System.out.println("객체 입력 전");
			
			oos.writeObject(member); // 바이트 형태로 저장되서 깨져서 보이는 값들도 있음~
						
			System.out.println("객체 입력 후");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public void fileRead() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e_object.dat"));) {

			System.out.println("객체 출력 전");
			
			Member member = (Member) ois.readObject(); // object를 반환하게 되는데 object는 최상위 클래스이기 때문에 자식 클래스의 참조변수로 부모를 가르칠 수 없어서 member 객체에 못 담아서 형변환 해야한다. (다운캐스팅)
			
			System.out.println(member);
			System.out.println("객체 출력 후");
			
			
		
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}

	
	public void objectsSave() {
		// Member 객체 배열에 담아서 반복문을 통해서 파일에 저장하기 ("f_objects.dat")
	}

	public void objectsRead() {
		// 파일에 저장 된 Member 객체를 읽어서 배열에 저장 후 각 객체의 toString() 메소드를 출력
	}






}
