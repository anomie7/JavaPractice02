package EventHandleEx;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ex01 extends JFrame {
	public Ex01() {
		setTitle("마우스 올리기 내리기 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new FlowLayout());

		JLabel la = new JLabel("Mouse Over");
		la.setSize(100, 100);
		la.addMouseListener(new MouseAdapter() {
			JLabel la;

			@Override
			public void mouseEntered(MouseEvent e) {
				la = (JLabel) e.getSource();
				la.setText("Love java");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				la = (JLabel) e.getSource();
				la.setText("사랑해");
			}
		});
		add(la);

		setSize(400, 400);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01();
	}
}
