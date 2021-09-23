import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Main extends JFrame{
JButton btnBack = new JButton("Change Background");
JButton btnFore = new JButton("Change Foreground");
JLabel label = new JLabel("This is a Label");
Main()
{
init();
action();
}
public void init()
{
btnBack.setBounds(20, 0, 200, 50);
btnFore.setBounds(360, 0, 200, 50);
label.setBounds(100, 80, 400, 100);
label.setBackground(Color.cyan);
label.setOpaque(true);
label.setForeground(Color.red);
label.setFont(new Font("MV BOli",Font.BOLD, 30));
setSize(600,300);
setVisible(true);
setLocationRelativeTo(null);
setResizable(false);
setTitle("JButton");
setLayout(null);
add(btnBack);
add(btnFore);
add(label);
}public void action()
{
btnBack.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JColorChooser colorChooser = new JColorChooser();
Color color = JColorChooser.showDialog(null, "Change Background Color", Color.cyan);
label.setBackground(color);
}
});
btnFore.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent e) {
JColorChooser colorChooser = new JColorChooser();
Color color = JColorChooser.showDialog(null, "Change Background Color", Color.red);
label.setForeground(color);
}
});
}
public static void main(String[] args) {
Main m = new Main();
}
}