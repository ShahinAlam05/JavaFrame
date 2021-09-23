
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Test1 extends JFrame{
	
	JTextField txtName = new JTextField();
	JTextField txtEmail = new JTextField();
	JTextField txtPhone = new JTextField();
	
	JLabel lblName = new JLabel ("Name: ");
	JLabel lblEmail = new JLabel ("Email:  ");
	JLabel lblPhone = new JLabel ("Phone: ");
	
	JButton btnSave = new JButton("Save");
	
	public Connection con = null;
	public Statement sta = null;

	Test1()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		txtName.setPreferredSize(new Dimension(220, 40));
		txtEmail.setPreferredSize(new Dimension(220, 40));
		txtPhone.setPreferredSize(new Dimension(220, 40));
		btnSave.setPreferredSize(new Dimension(100, 40));
		
		txtName.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtEmail.setFont(new Font("Verdana", Font.PLAIN, 20));
		txtPhone.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		btnSave.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		lblName.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblEmail.setFont(new Font("Verdana", Font.PLAIN, 20));
		lblPhone.setFont(new Font("Verdana", Font.PLAIN, 20));
		
		setSize(350,270);
		setVisible(true);
		setLocationRelativeTo(null);
		setTitle("Database");
		setResizable(false);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		add(lblName);
		add(txtName);
		add(lblEmail);
		add(txtEmail);
		add(lblPhone);
		add(txtPhone);
		add(btnSave);
	}
	
	public void action()
	{
		btnSave.addActionListener(new ActionListener(){
			
			public void actionPerformed(ActionEvent e) {
			
				try {
					String url = "jdbc:mysql://localhost:3306/abirsir";
					String sql = "insert into test1(name, email, phone) values ('"+txtName.getText().trim()+"', '"+txtEmail.getText().trim()+"', '"+txtPhone.getText().trim()+"')";
					Class.forName("com.mysql.jdbc.Driver").newInstance();
					con = DriverManager.getConnection(url,"root","");
					sta = con.createStatement();
					
					sta.executeUpdate(sql);
					
					JOptionPane.showMessageDialog(null, "Connection Established Successfully");
					txtName.setText(null);
					txtEmail.setText(null);
					txtPhone.setText(null);
				}
				catch (InstantiationException e1) {
					
					JOptionPane.showMessageDialog(null, e1);
				} 
				catch (IllegalAccessException e1) {
					
					JOptionPane.showMessageDialog(null, e1);
				} 
				catch (ClassNotFoundException e1) {
					
					JOptionPane.showMessageDialog(null, e1);
				} 
				catch (SQLException e1) {
					
					JOptionPane.showMessageDialog(null, e1);
				}
			}
		});
	}
	

	
	public static void main(String[] args) {
		
		new Test1();
	}

}

