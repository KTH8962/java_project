package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FlyingTextEx extends JFrame{
	private JLabel la = new JLabel("HELLO");
	private final int movingPos = 10;
	public FlyingTextEx() {
		setTitle("상하좌우 키 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
		Container c = getContentPane();
		c.setLayout(null);
		la.setLocation(50, 50);
		la.setSize(100,20);
		c.add(la);
		
		c.addKeyListener(new MyKeyListener());
		
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			Container c = (Container) e.getSource();
			int keyCode = e.getKeyCode();
			int X = la.getX();
			int Y = la.getY();
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				la.setLocation(X - movingPos, Y);
				c.setBackground(Color.BLUE);
			} else if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
				la.setLocation(X + movingPos, Y);
				c.setBackground(Color.LIGHT_GRAY);
			} else if(e.getKeyCode() == KeyEvent.VK_UP) {
				la.setLocation(X, Y - movingPos);
				c.setBackground(Color.WHITE);
			} else if(e.getKeyCode() == KeyEvent.VK_DOWN) {
				la.setLocation(X, Y + movingPos);
				c.setBackground(Color.MAGENTA);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlyingTextEx();
	}

}
