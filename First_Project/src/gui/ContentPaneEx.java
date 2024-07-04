package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	public ContentPaneEx() {
		setTitle("두번째 GUI 프로그램");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 50));
		
		c.setBackground(Color.orange);
		c.add(new JButton("버튼1"));
		c.add(new JButton("버튼2"));
		c.add(new JButton("버튼3"));
		c.add(new JButton("버튼4"));
		c.add(new JButton("버튼5"));
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
