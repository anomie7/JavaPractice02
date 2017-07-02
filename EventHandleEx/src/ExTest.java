import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;

public class ExTest extends JFrame{
	public ExTest(){
		setTitle("# 키를 누르면 프로그램이 종료됩니다.");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				char keychar = e.getKeyChar();
				int keycode = e.getKeyCode();
				
				if(keychar == '3')
					System.exit(0);
				else if(keycode == KeyEvent.VK_4)
					new ExTest();
			}
			
		});
		
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new ExTest();
	}
}
