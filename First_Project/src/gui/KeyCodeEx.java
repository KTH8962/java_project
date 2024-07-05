package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyCodeEx extends JFrame {
	private JLabel la = new JLabel();
	private Font font = new Font("키보드를 입력하세요", Font.ITALIC, 20);
	
	public KeyCodeEx() {
		setTitle("Key 이벤트 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(400, 300);
		setVisible(true);
		c.setLayout(null);
		la.setSize(260,20);
		la.setLocation(0, 110);
		la.setFont(font);
		//c.add(la, BorderLayout.CENTER);
		c.add(la);
		c.addKeyListener(new MyKeyListener());
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			la.setText(e.getKeyText(keyCode) + "키가 입력되었습니다.");
			Container c = (Container) e.getSource();
			if(e.getKeyChar() == '%') {
				c.setBackground(Color.YELLOW);
			} else if(e.getKeyCode() == KeyEvent.VK_F1) {
				c.setBackground(Color.GREEN);
			} else if(e.getKeyCode() == 17) {
				la.setOpaque(true);
				la.setBackground(Color.orange);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyCodeEx();
	}
}
