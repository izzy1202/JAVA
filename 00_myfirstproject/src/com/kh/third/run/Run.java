package com.kh.third.run;

import com.kh.third.MethodTest;// import문: 해당 패키지에 있는 클래스를 가져다 사용하겠다고 선언

public class Run {
	public static void main(String[] args) {
		
		//methodA()기능이 존재하는 클래스인 MethodTest 라고 하는 클래스를 메모리 영역에 할당하겠다.
		//자바 프로그래밍에서 = 기호는 같다가 아니라 대입한다는 의미(오른쪽 값을 왼쪽에 대입)
		//MethodTest라고하는 클래스로부터 객체를 생성해 메모리에 올리겠다.
		MethodTest mt = new MethodTest();
		
		
		/*
		 * 다른 클래스에 있는 메소드를 호출하려면
		 * 1.호출할 메소드가 존재하는 클래스를 생성(new) 해야한다.
		 * [표현법] 클래스이름 그 클래스를대변할이름(객체이름) = new 클래스이름();
		 * 
		 * 2.현재 패키지안에 내가 사용하고자 하는 클래스가 존재하지 않을 때 그 클래스를 가져다쓰겠다고 선언
		 * [표현법] import 해당클래스의 풀네임(패키지명.클래스명)
		 * 
		 * 3.해당 클래스에 있는 메소드를 호출(실행)
		 * [표현법] 대변할이름.메소드명();
		 * 
		 * 
		 */
		mt.methodA();
		mt.methodB();
		mt.methodC();
	}
}
