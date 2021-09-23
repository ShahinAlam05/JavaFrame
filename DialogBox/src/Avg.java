import javax.swing.JOptionPane;
public class Avg {

	public static void main(String[] args) {
	

		
				String num1 = JOptionPane.showInputDialog(null, "Input First Value","Input Title", JOptionPane.QUESTION_MESSAGE);
				String num2 = JOptionPane.showInputDialog(null, "Input Second Value","Input Title", JOptionPane.QUESTION_MESSAGE);
				String num3 = JOptionPane.showInputDialog(null, "Input Third Value","Input Title", JOptionPane.QUESTION_MESSAGE);
				
				double a,b,c,d;
				
				a = Double.parseDouble(num1);
				b = Double.parseDouble(num2);
				c = Double.parseDouble(num3);
				
				d = (a+b+c)/3;
				
				JOptionPane.showMessageDialog(null, "The result is: "+d, "Average", JOptionPane.QUESTION_MESSAGE);
			}

	}
