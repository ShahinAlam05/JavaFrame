import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	JTabbedPane tbPane = new JTabbedPane();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JCheckBox cb1 = new JCheckBox("Computers");
	JCheckBox cb2 = new JCheckBox("Electronics");
	JCheckBox cb3 = new JCheckBox("Marketing");
	
	JRadioButton rb1 = new JRadioButton("Graduate");
	JRadioButton rb2 = new JRadioButton("Post Graduate");
	JRadioButton rb3 = new JRadioButton("Ph.D");
	
	ButtonGroup bg = new ButtonGroup();
	
	Test()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		
		cb1.setFont(new Font("Verdana", Font.PLAIN, 16));
		cb2.setFont(new Font("Verdana", Font.PLAIN, 16));
		cb3.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		rb1.setFont(new Font("Verdana", Font.PLAIN, 16));
		rb2.setFont(new Font("Verdana", Font.PLAIN, 16));
		rb3.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		p2.add(rb1);
		p2.add(rb2);
		p2.add(rb3);
		
		tbPane.addTab("Education Qualifaction", p1);
		tbPane.addTab("Area of interest", p2);
		
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JTabbedPane");
		setVisible(true);
		
		add(tbPane);
	}
	
	public static void main(String[] args) {
		
		new Test();
	}

}
