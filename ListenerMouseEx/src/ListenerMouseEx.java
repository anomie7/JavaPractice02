import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class ListenerMouseEx extends JFrame{
	public ListenerMouseEx(){
		setTitle("��ư�� Mouse �̺�Ʈ ������ �ۼ�");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event �׽�Ʈ ��ư");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		
		add(btn);
		
		setSize(300, 150);
		setVisible(true);
	}
	public static void main(String[] args){
		new ListenerMouseEx();
	}
}
class MyMouseListener implements MouseListener{
	@Override
	public void mouseEntered(MouseEvent e){
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	@Override
	public void mouseExited(MouseEvent e){
		JButton btn = (JButton) e.getSource();
		btn.setBackground(Color.YELLOW);
	}
	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseClicked(MouseEvent e){}
}