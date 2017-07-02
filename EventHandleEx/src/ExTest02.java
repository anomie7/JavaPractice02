import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ExTest02 extends JFrame {
	public ExTest02() {
		setTitle("Click and Double Exercise");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Container contentPane = getContentPane();
		setContentPane(contentPane);

		MyMouseListener mouseHandle = new MyMouseListener();
		contentPane.addMouseListener(mouseHandle);

		setSize(400, 400);
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {

		@Override
		public void mouseClicked(MouseEvent e) {
			int r = (int) (Math.random() * 256);
			int g = (int) (Math.random() * 256);
			int b = (int) (Math.random() * 256);
			
			if (e.getClickCount() == 2) {
				JPanel contentPane = (JPanel) e.getSource();
				contentPane.setBackground(new Color(r, g, b));
			}
		}
	}

	public static void main(String[] args) {
		new ExTest02();
	}

}
