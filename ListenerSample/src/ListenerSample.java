import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ListenerSample extends JFrame{
	public ListenerSample(){
		setTitle("Action �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		JButton btn2 = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		
		btn.addActionListener(listener);
		btn2.addActionListener(listener);
		btn2.setBackground(Color.CYAN);
		
		add(btn);
		add(btn2);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args){
		new ListenerSample();
	}
}

class MyActionListener implements ActionListener{
	
	@Override
	public void actionPerformed(ActionEvent e){
		JButton b = (JButton) e.getSource();
		
		if(b.getText().equals("Action")){
			b.setText("�׼�");
			b.setBackground(Color.RED);
		}else{
			b.setBackground(Color.BLUE);
			b.setText("Action");
		}
	}
}