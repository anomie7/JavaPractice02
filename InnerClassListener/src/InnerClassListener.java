import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class InnerClassListener extends JFrame{
	public InnerClassListener(){
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
//		btn.addActionListener(new MyActionListener());
		btn.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e){
				JButton b = (JButton) e.getSource();
				if(b.getText().equals("Action")){
					b.setText("액션");
					b.setBackground(Color.CYAN);
				}else{
					b.setText("Action");
				}	
				setTitle("액션");
			}	
		});
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	
//	private class MyActionListener implements ActionListener{
//		public void actionPerformed(ActionEvent e){
//			JButton b = (JButton)e.getSource();
//			if(b.getText().equals("Action")){
//				b.setText("액션");			
//			}
//			else{
//				b.setText("Action");				
//			}
//			
//			setTitle(b.getText());
//		}
//	}
	
	public static void main(String[] args){
		new InnerClassListener();
	}
}
