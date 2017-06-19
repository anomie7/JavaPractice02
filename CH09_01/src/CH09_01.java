import javax.swing.*;
import java.awt.*;
public class CH09_01 extends JFrame{
	CH09_01(){
		setTitle("Let's study Java");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args){
		CH09_01 myFrame = new CH09_01();
	}
}
