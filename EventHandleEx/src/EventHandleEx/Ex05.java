package EventHandleEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex05 extends JFrame{
		String str = "Love Java";
		JPanel contentPane = new JPanel();
		int size;
		
	public Ex05(){
		setTitle("+, - 키로 폰트 크기 조절");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		
		JLabel la = new JLabel(str);
		Font f = new Font("Arial", Font.PLAIN, 10);
		la.setFont(f);
		size = f.getSize();
		
		la.addKeyListener(new KeyAdapter() {	
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyChar = e.getKeyChar();
				JLabel la = (JLabel) e.getSource();
				
				if(keyChar == '+'){
					size += 5;
					la.setFont(new Font("Arial", Font.PLAIN, size));
				}else if(keyChar == '-'){
					size -= 5;
					la.setFont(new Font("Arial", Font.PLAIN, size));
					if(size <= 5){
						size = 10;
					}
				}
			}
			
		});
		
		contentPane.add(la);
		setSize(300, 300);
		setVisible(true);
		
		la.requestFocus();
	}
	public static void main(String[] args){
		new Ex05();
	}

}
