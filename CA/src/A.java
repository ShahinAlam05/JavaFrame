import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class A extends JFrame{
	
	JTabbedPane tbPane = new JTabbedPane();
	JPanel p1 = new JPanel();
	JPanel p2 = new JPanel();
	
	JCheckBox cb1 = new JCheckBox("Computers");
	JCheckBox cb2 = new JCheckBox("Electronics");
	JCheckBox cb3 = new JCheckBox("Marketing");
	JLabel lbl = new JLabel();
	
	
	ButtonGroup bg = new ButtonGroup();
    String[] progLanguage = {"C","C++","Java","Python","Php","Html"};
	
	JComboBox cb = new JComboBox(progLanguage);
//	JScrollPane scrollPane = new JScrollPane(cb);
	
	A()
	{
		initSetup();
	}
	
	public void initSetup()
	{
		p1.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
		
		
		cb1.setFont(new Font("Verdana", Font.PLAIN, 16));
		cb2.setFont(new Font("Verdana", Font.PLAIN, 16));
		cb3.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		
		
		p1.add(cb1);
		p1.add(cb2);
		p1.add(cb3);
		
		
		
		
		
		tbPane.addTab("Education Qualifaction", p1);
		tbPane.addTab("Area of interest", p2);
		
		setSize(500, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JTabbedPane");
		setVisible(true);
		
		add(tbPane);
		
		
//		scrollPane.setBounds(65, 50, 150, 50);
//		lbl.setBounds(60, 100, 180, 100);
		
		cb.setFont(new Font("Verdana", Font.PLAIN, 16));
		lbl.setFont(new Font("Verdana", Font.PLAIN, 16));
		
		setSize(300, 280);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JList");
		setLayout(null);
		setVisible(true);
		
//		add(scrollPane);
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
		
		new A();
	}

}
