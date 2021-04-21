package com.hk.app;

import javax.swing.*;

// 2번째 방법 JFrame을 상속해서 윈도우 Frame을 구성
public class MyFrame1 extends JFrame {
	
	//생성자를 통해서 Frame 설정
	public MyFrame1() {
		setTitle("윈도우제목");
		setSize(300,300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MyFrame1 mf = new MyFrame1();
	}

}
