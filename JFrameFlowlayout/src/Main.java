import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	
		JButton btn1 = new JButton("1");
		JButton btn2 = new JButton("2");
		JButton btn3 = new JButton("3");
		JButton btn4 = new JButton("4");
		JButton btn5 = new JButton("5");
		JButton btn6 = new JButton("6");
		JButton btn7 = new JButton("7");
		JButton btn8 = new JButton("8");
		JButton btn9 = new JButton("9");
		JButton btn10 = new JButton("10");

		JPanel panel = new JPanel();
		
		Main()
		{
			init();
		}
		
	public void init()
	{
		setSize(700,700);
		setVisible(true);
		setLocationRelativeTo(null);
		
		setTitle("JLayout");
		setLayout(new FlowLayout(FlowLayout.CENTER,20,20));
		
		panel.setPreferredSize(new Dimension(300,300));
		panel.setBackground(Color.lightGray);
		panel.setLayout(new FlowLayout());
		
		
		panel.add(btn1);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		panel.add(btn6);
		panel.add(btn7);
		panel.add(btn8);
		panel.add(btn9);
		panel.add(btn10);
		
		add(panel);
	}

	public static void main(String[] args) {
		Main m =new Main();
	}
		
		
	}


 