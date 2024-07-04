package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		setTitle("두번째 GUI 프로그램");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new BorderLayout(10,10));
		
		c.setBackground(Color.orange);
		c.add(new JButton("버튼1"), BorderLayout.WEST);
		c.add(new JButton("버튼2"), BorderLayout.CENTER);
		c.add(new JButton("버튼3"), BorderLayout.SOUTH);
		c.add(new JButton("버튼4"), BorderLayout.NORTH);
		c.add(new JButton("버튼5"), BorderLayout.EAST);
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEx();
	}

}
