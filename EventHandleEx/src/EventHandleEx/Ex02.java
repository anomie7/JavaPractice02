package EventHandleEx;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class Ex02 extends JFrame {
	public Ex02() {
		setTitle("드래깅 동안 노란색 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.GREEN);

		MyMouseListener lst = new MyMouseListener();
		addMouseMotionListener(lst);
		addMouseListener(lst);

		setSize(400, 400);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {
		@Override
		public void mouseDragged(MouseEvent e) {
			getContentPane().setBackground(Color.YELLOW);
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			getContentPane().setBackground(Color.GREEN);
		}
	}

	public static void main(String[] args) {
		new Ex02();
	}
}
