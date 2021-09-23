
import javax.swing.JFrame;

public class JframeBasic {

	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//frame.setSize(400,300);
		//frame.setLocation(300,100);
		//frame.setLocationRelativeTo(null);
		
		frame.setBounds(300,100,400,300);
		frame.setTitle("JFrame Demo");
		frame.setResizable(false);
	}
	
}