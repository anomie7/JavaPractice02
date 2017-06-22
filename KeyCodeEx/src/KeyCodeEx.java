import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class KeyCodeEx extends JFrame{
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	
	public KeyCodeEx(){
		setTitle("Key Code 예제: F1키: 초록색, % 키 노란색, home 키 빨강색");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		contentPane.add(la);
		setSize(300, 150);
		setVisible(true);
		
		contentPane.requestFocus();
	}
	
	class MyKeyListener extends KeyAdapter {
		
		@Override
		public void keyPressed(KeyEvent e){
			la.setText(e.getKeyText(e.getKeyCode()));
			if(e.getKeyChar() == '%'){
				contentPane.setBackground(Color.YELLOW);
			}else if(e.getKeyCode() == KeyEvent.VK_F1){
				contentPane.setBackground(Color.GREEN);
			}else if(e.getKeyCode() == KeyEvent.VK_HOME){
				contentPane.setBackground(Color.RED);
			}
		}
	}
	
	public static void main(String[] args){
		new KeyCodeEx();
	}
}
