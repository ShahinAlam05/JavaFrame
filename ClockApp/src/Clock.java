import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock extends JFrame{
	
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss a");
	String timeString;
	JLabel timeLabel = new JLabel();
	
	SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
	String dayString;
	JLabel dayLabel = new JLabel();
	
	JLabel barLabel1 = new JLabel();
	JLabel barLabel2 = new JLabel();
	
	SimpleDateFormat dateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
	String dateString;
	JLabel dateLabel = new JLabel();
	
	SimpleDateFormat secondFormat = new SimpleDateFormat("ss");
	String secondString;
	
	
	
	Clock()
	{
		initSetup();
		setTime();
	}
	
	public void initSetup()
	{
		setVisible(true);
		setSize(430, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setTitle("Clock App");
		setLayout(null);
		setResizable(false);
		
		timeLabel.setBounds(0, 0, 420, 120);
		timeLabel.setBackground(Color.BLACK);
		timeLabel.setForeground(Color.GREEN);
		timeLabel.setFont(new Font("Arial", Font.PLAIN, 68));
		timeLabel.setOpaque(true);
		
		barLabel1.setBounds(0, 120, 420, 5);
		barLabel1.setBackground(Color.RED);
		barLabel1.setOpaque(true);
		
		dayLabel.setBounds(0, 125, 420, 100);
		dayLabel.setFont(new Font("Arial", Font.PLAIN, 65));
		dayLabel.setForeground(Color.BLUE);
		dayLabel.setBackground(Color.BLACK);
		dayLabel.setOpaque(true);
		
		barLabel2.setBounds(0, 225, 420, 5);
		barLabel2.setBackground(Color.RED);
		barLabel2.setOpaque(true);
		
		dateLabel.setBounds(0,230, 420, 100);
		dateLabel.setBackground(Color.BLACK);
		dateLabel.setOpaque(true);
		dateLabel.setForeground(Color.YELLOW);
		dateLabel.setFont(new Font("Arial", Font.PLAIN, 58));
		
		add(timeLabel);
		add(barLabel1);
		add(dayLabel);
		add(barLabel2);
		add(dateLabel);
	}
	
	public void setTime()
	{
		while(true){
			
			timeString = timeFormat.format(Calendar.getInstance().getTime());
			timeLabel.setText(timeString);
			
			dayString = dayFormat.format(Calendar.getInstance().getTime());
			dayLabel.setText(dayString);
			
			dateString = dateFormat.format(Calendar.getInstance().getTime());
			dateLabel.setText(dateString);
			
			secondString = secondFormat.format(Calendar.getInstance().getTime());
			double sec = Double.parseDouble(secondString);
			double sec1 = (sec/60)*420;
			int finalSec = (int) sec1;
			
			barLabel1.setBounds(0, 120, finalSec, 5);
			barLabel2.setBounds(0, 225, 420-finalSec, 5);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args)
	{
		new Clock();
	}

}
