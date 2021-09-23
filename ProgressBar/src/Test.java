import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test extends JFrame{

	JProgressBar pbar = new JProgressBar();
	JLabel label = new JLabel(new ImageIcon("images/emoji1.jpg"));
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		
		pbar.setPreferredSize(new Dimension(450, 30));
		//pbar.setValue(20);
		pbar.setStringPainted(true);
		pbar.setFont(new Font("MV Boli", Font.PLAIN, 20));
		pbar.setForeground(Color.green);
		
		
		setVisible(true);
		setBounds(250, 50, 450, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Progress Bar");
		setLayout(new FlowLayout());
		
		add(label);
		add(pbar);
		
		fill();
	}
	
	public void fill() {
		
		int count = 0;
		
		while(count<=100)
		{
			pbar.setValue(count);
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
		}
		
		dispose();
		
		Calculator c =new Calculator();
		
	}

	public void action()
	{
		
	}
	
	
	public static void main(String[] args) {
		
		new Test();

	}

}
