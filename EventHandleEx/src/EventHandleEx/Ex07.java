package EventHandleEx;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex07 extends JFrame {
	JLabel la = new JLabel("Love Java");
	JPanel p = new JPanel();
	int size = 5;

	public Ex07() {
		setTitle("마우스 휠을 굴려 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(p);
		p.setLayout(new FlowLayout());

		Font f = new Font("Arial", Font.PLAIN, size);
		la.setFont(f);

		size = f.getSize();
		la.addMouseWheelListener(new MouseAdapter() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				if (e.getWheelRotation() < 0) { // e.getWheelRotation is less
												// than 0, it means up direction
					la.setFont(new Font("Arial", Font.PLAIN, size += 5));
				} else {
					if (size > 5)
						la.setFont(new Font("Arial", Font.PLAIN, size -= 5));
				}
			}
		});
		p.add(la);

		setSize(500, 500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex07();
	}

}
