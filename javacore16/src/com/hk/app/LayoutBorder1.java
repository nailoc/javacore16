package com.hk.app;

import java.awt.*;
import javax.swing.*;

public class LayoutBorder1 extends JFrame {
	
	public LayoutBorder1() {
		
		setTitle("윈도우제목");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container pane = getContentPane();
		pane.setLayout(new BorderLayout());
		
		JButton btn1 = new JButton("center");
		JButton btn2 = new JButton("top");
		JButton btn3 = new JButton("bottom");
		JButton btn4 = new JButton("left");
		JButton btn5 = new JButton("right");
		
		pane.add(btn1, BorderLayout.CENTER);
		pane.add(btn2, BorderLayout.NORTH);
		pane.add(btn3, BorderLayout.SOUTH);
		pane.add(btn4, BorderLayout.WEST);
		pane.add(btn5, BorderLayout.EAST);
		
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		
		LayoutBorder1 b1 = new LayoutBorder1();
	}

}
