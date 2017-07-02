package EventHandleEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex03 extends JFrame{
		StringBuilder str = new StringBuilder("Love Java");
		JPanel contentPane = new JPanel();
		
	public Ex03(){
		setTitle("Left 키로 문자열 반대로 정렬");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		JLabel la = new JLabel(str.toString() );
		
		la.addKeyListener(new KeyAdapter() {	
			
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				if(keyCode == KeyEvent.VK_LEFT){
					JLabel la = (JLabel) e.getSource();
					System.out.println("pressed");
					la.setText(str.reverse().toString());
				}else if(keyCode == KeyEvent.VK_1){
					la.setText("1");
				}
			}
			
		});
		
		contentPane.add(la);
		setSize(300, 300);
		setVisible(true);
		
		la.requestFocus();
	}
	public static void main(String[] args){
		new Ex03();
	}

}
