import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Test extends JFrame{
	
	String[] progLanguage = {"C","C++","Java","Python","Php","Html"};
	
	JComboBox cb = new JComboBox(progLanguage);
	JScrollPane scrollPane = new JScrollPane(cb);
	
	JLabel lbl = new JLabel();
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		scrollPane.setBounds(65, 50, 150, 50);
		lbl.setBounds(60, 100, 180, 100);
		
		cb.setFont(new Font("Verdana", Font.PLAIN, 16));
		lbl.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		setSize(300, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JList");
		setLayout(null);
		setVisible(true);
		
		add(scrollPane);
		add(lbl);
	}
	
	public void action()
	{
		cb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				lbl.setText("You Selected : "+cb.getSelectedItem());
			}
		});
	}
	
	public static void main(String[] args) {
	
		new Test();
	}
}
