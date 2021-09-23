import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

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
		

		JPanel panel = new JPanel();
		
		Main()
		{
			init();
		}
		
	public void init()
	{
		setSize(400,400);
		setVisible(true);
		setLocationRelativeTo(null);
		
		setTitle("JLayout");
		setLayout(new GridLayout(3,3,10,10));
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		
	}

	public static void main(String[] args) {
		Main m =new Main();
	}
		
		
	}


 