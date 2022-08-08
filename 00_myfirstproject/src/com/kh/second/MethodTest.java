package com.kh.second;
//패키지명은 항상 소문자로 작성

public class MethodTest {

	public static void main(String[] args) {
		System.out.println("메인 메소드 실행중!");
		methodA();
		System.out.println("돌아왔나?");
	}
	
	public static void methodA() {
		System.out.println("메소드A 실행중!");
		methodB();
	}
	
	public static void methodB() {
		System.out.println("메소드B 실행중!");
		
	}
}
