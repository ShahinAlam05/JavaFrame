import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class JFrameFirstCode {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension Screensize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int width = Screensize.width;
		int height = Screensize.height;
		frame.setSize(width, height);
		
		frame.setTitle("New Frame");
		frame.setResizable(false);

	}

}