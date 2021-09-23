import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import java.awt.*;
import java.awt.event.*;


public class Test extends JFrame{
	
	JPanel panel = new JPanel();
	JSlider slider = new JSlider(0, 100, 50);
	
	JLabel label = new JLabel();
	
	Test()
	{
		initSetup();
		action();
	}
	
	public void initSetup()
	{
		
		panel.setBounds(0, 0, 400, 400);
		
		//slider.setPreferredSize(new Dimension(200, 200));
		slider.setBounds(10, 10, 300, 200);
		
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setMinorTickSpacing(10);
		slider.setMajorTickSpacing(25);
		
		
		slider.setFont(new Font("MV Boli", Font.PLAIN, 15));
		
		//slider.setOrientation(SwingConstants.VERTICAL);
		
		label.setBounds(165, 200, 100, 50);
		label.setFont(new Font("MV Boli", Font.PLAIN, 15));
		label.setText(slider.getValue()+" C");
		
		panel.setLayout(null);
		
		panel.add(slider);
		panel.add(label);
		
		setSize(400, 400);
		setVisible(true);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("JSlider");
		
		
		add(panel);
		
	}
	
	public void action()
	{
	
		slider.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent arg0) {
				
				label.setText(slider.getValue()+" C");
			}
		});
	}
	
	
	public static void main(String[] args)
	{
		new Test();
	}

}
