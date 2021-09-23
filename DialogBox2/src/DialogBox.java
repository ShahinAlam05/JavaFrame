import javax.swing.JOptionPane;

public class DialogBox {
	
	public static void main(String[] args)
	{
		int x = JOptionPane.showConfirmDialog(null,"Are you want to Add?","Addition",JOptionPane.YES_NO_CANCEL_OPTION);
		
		if(x==0)
		{
			String num1 = JOptionPane.showInputDialog(null,"Enter first Number ","Input",JOptionPane.INFORMATION_MESSAGE);
			String num2 = JOptionPane.showInputDialog(null,"Enter second Number ","Input",JOptionPane.INFORMATION_MESSAGE);
			
			int a,b,c;
			
			a = Integer.parseInt(num1);
			b = Integer.parseInt(num2);
			
			c = a + b;
			
			JOptionPane.showMessageDialog(null,"The Result is : "+c);
		}
		
		if(x==1)
		{
			JOptionPane.showMessageDialog(null,"NO");
			//System.out.println("NO");
		}
		if(x==2)
		{
			//JOptionPane.showMessageDialog(null,"CANCEL");
			System.out.println("CANCEL");
		}
	}

}
