import javax.swing.*;
import java.awt.*;

public class Ch09_03 extends JFrame{
	public Ch09_03() {
		setTitle("Ten Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 10));
		
		JButton[] b = new JButton[10];
		for(int i = 0; i < 10; i++){
			b[i] = new JButton(Integer.toString(i));
			add(b[i]);
		}
		
		setSize(600, 200);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ch09_03();
	}
}
