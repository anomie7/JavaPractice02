import java.awt.Color;

import javax.swing.*;

class MyFrame extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public MyFrame(String name){
		super(name);
//		etTitle("첫번째 프레임");
		setSize(600, 600);
		getContentPane().setBackground(Color.YELLOW);
		setVisible(true);
	}
}
public class MyApp01 {
	public static void main(String[] args){
		MyFrame mf = new MyFrame("첫번째 프레임");
	}
	

}
