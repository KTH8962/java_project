package gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseListenerAllEx extends JFrame {
	private JLabel la = new JLabel("No Mouse Event");
	
	public MouseListenerAllEx() {
		setTitle("마우스 이벤트");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setSize(400, 400);
		setVisible(true);
		
		MyMouseListener listener = new MyMouseListener();
		c.addMouseListener(listener);
		c.addMouseMotionListener(listener);
		
		c.setLayout(new FlowLayout());
		c.add(la);
	}
	
	class MyMouseListener extends MouseAdapter {
		Container c = getContentPane(); 
		public void mousePressed(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mousePressed (" + X + "," + Y + ")");
		}
		public void mouseReleased(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mouseReleased (" + X + "," + Y + ")");
		}
		public void mouseEntered(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mouseEntered (" + X + "," + Y + ")");
			c.setBackground(Color.CYAN);
		}
		public void mouseExited(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mouseExited (" + X + "," + Y + ")");
			Component c = (Component) e.getSource();
			c.setBackground(Color.YELLOW);
		}
		public void mouseDragged(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mouseDragged (" + X + "," + Y + ")");
		}
		public void mouseMoved(MouseEvent e) {
			int X = e.getX(), Y = e.getY();
			la.setText("mouseMoved (" + X + "," + Y + ")");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerAllEx();
	}

}
