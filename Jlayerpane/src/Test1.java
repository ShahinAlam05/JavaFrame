import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import java.awt.*;

public class Test1 extends JFrame{
	
	JLayeredPane layer = new JLayeredPane();
	
	JLabel lbl1 = new JLabel();
	JLabel lbl2 = new JLabel();
	JLabel lbl3 = new JLabel();
	

	Test1()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JLayeredPane");
		setLayout(null);
		
		layer.setBounds(0,0,500,500);
		
		lbl1.setOpaque(true);
		lbl1.setBackground(Color.red);
		lbl1.setBounds(50,50,200,200);
		
		lbl2.setOpaque(true);
		lbl2.setBackground(Color.blue);
		lbl2.setBounds(100,100,200,200);
		
		lbl3.setOpaque(true);
		lbl3.setBackground(Color.green);
		lbl3.setBounds(150,150,200,200);
		
		layer.add(lbl1, Integer.valueOf(0));
		layer.add(lbl2, Integer.valueOf(1));
		layer.add(lbl3, Integer.valueOf(2));
		
		add(layer);
		
	}
	
	
	public static void main(String[] args) {
		
		Test1 obj = new Test1();

	}

}
