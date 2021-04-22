package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class Exam3 extends JFrame {

	public Exam3() {
		
		setTitle("EXAM3-계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new BorderLayout());
		
		JTextField result = new JTextField("");
		// 버튼이 16개 생성해서 추가
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Exam3 ex3 = new Exam3();
	}
}
