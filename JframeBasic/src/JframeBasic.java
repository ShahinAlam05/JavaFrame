import javax.swing.JFrame;
import javax.swing.ImageIcon;

public class JframeBasic extends JFrame {

	private ImageIcon icon;
	
	
	JframeBasic()
	{
		init();
		
	}
	
	public void init()
	{
		setVisible(true);
		setSize(300,300);
		setTitle("New Frame");
		setResizable(false);
		setLocationRelativeTo(null);
		
		icon = new ImageIcon("image/c.png");
		setIconImage(icon.getImage());
		
	}
	
	public static void main(String[] args) {
		
		JframeBasic frame = new JframeBasic();
		
			
	}
	
}
