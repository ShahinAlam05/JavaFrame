
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;


public class Test extends JFrame{

	
	JCheckBox ckbGardening = new JCheckBox("Gardening");
	JCheckBox ckbSleeping = new JCheckBox("Sleeping");
	JCheckBox ckbWalking = new JCheckBox("Walking");
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		ckbGardening.setBounds(10, 10, 100, 50);
		ckbSleeping.setBounds(130, 10, 100, 50);
		ckbWalking.setBounds(260, 10, 100, 50);
		
		
		setSize(500, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JCheck Box");
		setLayout(null);
		
		add(ckbGardening);
		add(ckbSleeping);
		add(ckbWalking);
	}
	
	public void action()
	{
		
		ckbGardening.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("Hobby is Gardening");
				//JOptionPane.showMessageDialog(null, "Hobby is Gardening");
			}
		});
		
		ckbSleeping.addItemListener(new ItemListener() {
			
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("Hobby is Sleeping");
				//JOptionPane.showMessageDialog(null, "Hobby is Sleeping");
			}
		});

		ckbWalking.addItemListener(new ItemListener() {
	
			public void itemStateChanged(ItemEvent arg0) {
				System.out.println("Hobby is Walking");
				//JOptionPane.showMessageDialog(null, "Hobby is Walking");
			}
		});
		
	}
	
	public static void main(String[] args)
	{
		new Test();
	}
}
