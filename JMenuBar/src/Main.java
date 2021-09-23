import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Main extends JFrame{
JMenuBar menuBar = new JMenuBar();
JMenu FileMenu = new JMenu("File");
JMenu EditMenu = new JMenu("Edit");
JMenu SourceMenu = new JMenu("Source");
JMenuItem LoadItem = new JMenuItem("Load");
JMenuItem SaveItem = new JMenuItem("Save");
JMenuItem ExitItem = new JMenuItem("Exit");
ImageIcon LoadIcon = new ImageIcon("images/load.png");
ImageIcon SaveIcon = new ImageIcon("images/save.png");
ImageIcon ExitIcon = new ImageIcon("images/exit.png");
Main(){
init();
action();
}
private void init() {
LoadItem.setIcon(LoadIcon);
SaveItem.setIcon(SaveIcon);
ExitItem.setIcon(ExitIcon);
FileMenu.add(LoadItem);
FileMenu.add(SaveItem);
FileMenu.add(ExitItem);
menuBar.add(FileMenu);
menuBar.add(EditMenu);
menuBar.add(SourceMenu);
LoadItem.setMnemonic(KeyEvent.VK_L);
SaveItem.setMnemonic(KeyEvent.VK_S);
ExitItem.setMnemonic(KeyEvent.VK_E);setSize(450, 320);
setVisible(true);
setTitle("MenuBar");
setLocationRelativeTo(null);
setResizable(false);
setLayout(new FlowLayout());
setJMenuBar(menuBar);
}
private void action() {
LoadItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
System.out.println("Loading......");
}
});
SaveItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
System.out.println("Saving......");
}
});
ExitItem.addActionListener(new ActionListener() {
@Override
public void actionPerformed(ActionEvent arg0) {
System.exit(0);
}
});
}
public static void main(String[] args) {
Main m = new Main();
}
}