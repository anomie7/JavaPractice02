import java.awt.Color;
import javax.swing.*;
public class MyFrame extends JFrame{
	
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

		MyFrame(){
			setTitle("ù��° ������");
			setSize(600, 600);
			getContentPane().setBackground(Color.RED);
			setVisible(true);
		}
		
		public static void main(String[] args){
			MyFrame mf = new MyFrame();
//			new MyFrame();
			//mf.setBackground(Color.RED);
		}
	}


