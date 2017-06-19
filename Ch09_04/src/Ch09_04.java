import javax.swing.*;
import java.awt.*;

public class Ch09_04 extends JFrame{
	
	Color[] bg = {Color.RED, Color.ORANGE, Color.GREEN, Color.CYAN, Color.BLUE, Color.MAGENTA,
			Color.DARK_GRAY, Color.PINK, Color.LIGHT_GRAY, Color.GRAY};
	public Ch09_04(){
		setTitle("Ten Color Buttons Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(1, 10));
		for(int i = 0; i < 10; i++){
			JButton b = new JButton(Integer.toString(i));
			b.setBackground(bg[i]);
			add(b);
		}
		
		
		setSize(500, 300);
		setVisible(true);
	}
	public static void main(String[] args){
		new Ch09_04();
	}
}
