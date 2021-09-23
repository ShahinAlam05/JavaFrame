
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Test extends JFrame{
	
	String[] animals = {"Dog", "Bird", "Tiger", "Lion"};
	
	JComboBox cb = new JComboBox(animals);
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		
		setSize(300, 300);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);
		setTitle("JCombo Box");
		
		cb.setBounds(10, 10, 100, 40);
		
		//cb.addItem("Fish");
		//cb.insertItemAt("Fish", 2);
		//cb.setSelectedIndex(2);
		//cb.removeItem("Lion");
		//cb.removeItemAt(1);
		//cb.removeAll();
		
		add(cb);
		
	}
	
	public void action()
	{
		cb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent a) {
				
				System.out.println(cb.getSelectedItem());
			}
		});
	}
	
	
	public static void main(String[] args)
	{
		new Test();
	}

}
