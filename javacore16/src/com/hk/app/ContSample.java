package com.hk.app;

import java.awt.*;
import javax.swing.JFrame;

public class ContSample extends JFrame {

	public ContSample() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,200);
		
		Container mainPane = getContentPane();
		mainPane.setLayout(new FlowLayout());
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		ContSample control = new ContSample();
	}
}
