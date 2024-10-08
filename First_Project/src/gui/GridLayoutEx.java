package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx extends JFrame {
	public GridLayoutEx() {
		setTitle("그리드 프로그램");
		Container c = getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid = new GridLayout(4,2);
		grid.setVgap(10);
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new TextField());
		c.add(new JLabel("학번"));
		c.add(new TextField());
		c.add(new JLabel("학과"));
		c.add(new TextField());
		c.add(new JLabel("과목"));
		c.add(new TextField());
		
		
		setSize(300, 300);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutEx();
	}

}
