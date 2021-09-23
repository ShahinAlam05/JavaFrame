import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends JFrame{
	
	JTextField txt1 = new JTextField();
	JTextField txt2 = new JTextField();
	
	JButton btnAdd = new JButton("+");
	JButton btnSub = new JButton("-");
	JButton btnMul = new JButton("X");
	JButton btnDiv = new JButton("\u00F7");
	
	JLabel lblAddResult = new JLabel();
	JLabel lblSubResult = new JLabel();
	JLabel lblMulResult = new JLabel();
	JLabel lblDivResult = new JLabel();
	
	public Calculator()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		txt1.setBounds(10, 10, 150, 50);
		txt1.setFont(new Font("consolas", Font.BOLD, 22));
		
		txt2.setBounds(200, 10, 150, 50);
		txt2.setFont(new Font("consolas", Font.BOLD, 22));
		
		btnAdd.setBounds(65, 80, 50, 50);
		btnSub.setBounds(125, 80, 50, 50);
		btnMul.setBounds(185, 80, 50, 50);
		btnDiv.setBounds(245, 80, 50, 50);
		
		btnAdd.setFocusable(false);
		btnSub.setFocusable(false);
		btnMul.setFocusable(false);
		btnDiv.setFocusable(false);
		
		btnAdd.setFont(new Font("consolas", Font.BOLD, 25));
		btnSub.setFont(new Font("consolas", Font.BOLD, 25));
		btnMul.setFont(new Font("consolas", Font.BOLD, 25));
		btnDiv.setFont(new Font("consolas", Font.BOLD, 25));
		
		lblAddResult.setBounds(10, 170, 350, 50);
		lblAddResult.setFont(new Font("consolas", Font.BOLD, 22));
		lblAddResult.setForeground(Color.DARK_GRAY);
		
		lblSubResult.setBounds(10, 230, 350, 50);
		lblSubResult.setFont(new Font("consolas", Font.BOLD, 22));
		lblSubResult.setForeground(Color.DARK_GRAY);
		
		lblMulResult.setBounds(10, 290, 350, 50);
		lblMulResult.setFont(new Font("consolas", Font.BOLD, 22));
		lblMulResult.setForeground(Color.DARK_GRAY);
		
		lblDivResult.setBounds(10, 350, 350, 50);
		lblDivResult.setFont(new Font("consolas", Font.BOLD, 22));
		lblDivResult.setForeground(Color.DARK_GRAY);
		
		setSize(375, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Simple Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		add(txt1);
		add(txt2);
		
		add(btnAdd);
		add(btnSub);
		add(btnMul);
		add(btnDiv);
		
		add(lblAddResult);
		add(lblSubResult);
		add(lblMulResult);
		add(lblDivResult);
	}
	
	public void action()
	{
		
		btnAdd.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String snum1 = txt1.getText();
				String snum2 = txt2.getText();
				
				if(snum1.isEmpty() || snum2.isEmpty())
				{
					lblAddResult.setForeground(Color.red);
					lblAddResult.setText("Empty TextField");
					lblSubResult.setText(null);
					lblMulResult.setText(null);
					lblDivResult.setText(null);
					
				}
				else
				{
					double num1 = Double.parseDouble(snum1);
					double num2 = Double.parseDouble(snum2);
					double num3 = num1+num2;
					String result = num3+"";
					lblAddResult.setForeground(Color.DARK_GRAY);
					lblAddResult.setText("Addition result: "+result);
				}	
				
			}
		});
		

		btnSub.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String snum1 = txt1.getText();
				String snum2 = txt2.getText();
				
				if(snum1.isEmpty() || snum2.isEmpty())
				{
					lblSubResult.setForeground(Color.red);
					lblSubResult.setText("Empty TextField");
					lblAddResult.setText(null);
					lblMulResult.setText(null);
					lblDivResult.setText(null);
				}
				else
				{
					double num1 = Double.parseDouble(snum1);
					double num2 = Double.parseDouble(snum2);
					double num3 = num1-num2;
					String result = num3+"";
					lblSubResult.setForeground(Color.DARK_GRAY);
					lblSubResult.setText("Subtraction result: "+result);
				}	
				
			}
		});
		
		btnMul.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String snum1 = txt1.getText();
				String snum2 = txt2.getText();
				
				if(snum1.isEmpty() || snum2.isEmpty())
				{
					lblMulResult.setForeground(Color.red);
					lblMulResult.setText("Empty TextField");
					lblSubResult.setText(null);
					lblAddResult.setText(null);
					lblDivResult.setText(null);
				}
				else
				{
					double num1 = Double.parseDouble(snum1);
					double num2 = Double.parseDouble(snum2);
					double num3 = num1*num2;
					String result = num3+"";
					lblMulResult.setForeground(Color.DARK_GRAY);
					lblMulResult.setText("Multiplication result: "+result);
				}	
				
			}
		});
		
		btnDiv.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				String snum1 = txt1.getText();
				String snum2 = txt2.getText();
				
				if(snum1.isEmpty() || snum2.isEmpty())
				{
					lblDivResult.setForeground(Color.red);
					lblDivResult.setText("Empty TextField");
					lblSubResult.setText(null);
					lblMulResult.setText(null);
					lblAddResult.setText(null);
				}
				else
				{
					double num1 = Double.parseDouble(snum1);
					double num2 = Double.parseDouble(snum2);
					double num3 = num1/num2;
					String result = num3+"";
					lblDivResult.setForeground(Color.DARK_GRAY);
					lblDivResult.setText("Division result: "+result);
				}	
				
			}
		});
	}
	
	
	public static void main(String[] args)
	{
		new Calculator();
	}

}
