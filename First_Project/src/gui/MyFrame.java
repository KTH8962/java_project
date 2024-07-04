package gui;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("첫번째 GUI 프로그램"); // super("첫번째 GUI 프로그램");
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		MyFrame frame = new MyFrame();
	}

}
