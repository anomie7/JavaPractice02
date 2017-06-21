import javax.swing.*;
import java.awt.*;

public class Ex09_05 extends JFrame{
	Color[] bg = {Color.BLACK, Color.BLUE, Color.CYAN, Color.DARK_GRAY, Color.GRAY, Color.GREEN, Color.LIGHT_GRAY,
				  Color.MAGENTA, Color.ORANGE, Color.PINK, Color.RED, Color.WHITE, Color.YELLOW, Color.MAGENTA, Color.CYAN
				  , Color.PINK};
	public Ex09_05(){
		setTitle("4x4 Grid Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new GridLayout(4,4));
		for(int i = 0; i < 16; i++){
			JLabel la = new JLabel(Integer.toString(i));
			la.setBackground(bg[i]);
			la.setOpaque(true);
			add(la);
		}
		
		setSize(600, 300);
		setVisible(true);
	}
	
	public static void main(String[] args){
		new Ex09_05();
	}

}
