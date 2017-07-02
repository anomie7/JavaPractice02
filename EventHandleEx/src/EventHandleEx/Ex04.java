package EventHandleEx;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 extends JFrame{
		String str = "Love Java";
		JPanel contentPane = new JPanel();
		
	public Ex04(){
		setTitle("Left 키로 문자열 반대로 정렬");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout());
		JLabel la = new JLabel(str);
		
		la.addKeyListener(new KeyAdapter() {	
			int i = 0;
			int j = 1;
			@Override
			public void keyPressed(KeyEvent e) {
				int keyCode = e.getKeyCode();
				
				if(keyCode == KeyEvent.VK_LEFT){
					JLabel la = (JLabel) e.getSource();
					
					System.out.println(str.substring(i + j) + str.substring(0, i+j) + j );
					la.setText(str.substring(i + j) + str.substring(0, i+j) );
					j++;
					
					if(j > 9){
						j = 1;
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
		new Ex04();
	}

}
