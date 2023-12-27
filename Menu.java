package Java547;
import java.awt.*;
import javax.swing.*;
class Menu_Bar{
	JMenuItem i1,i2,i3,i4;
	JMenu menu,submenu;
	Menu_Bar(){
		JFrame f=new JFrame("Menu Bar Example");
		JMenuBar mb=new JMenuBar();  
		menu=new JMenu("Menu");
		submenu= new JMenu("Download");
		i1=new JMenuItem("Save");
		i2=new JMenuItem("Exit");
		i3=new JMenuItem("Download as .txt");
		i4=new JMenuItem("Download as .ipnyb");
		menu.add(i1);
		menu.add(i2);
		submenu.add(i3);
		submenu.add(i4);
		menu.add(submenu);
		mb.add(menu);
	    f.setJMenuBar(mb);  
        f.setSize(400,400);  
        f.setLayout(null);  
        f.setVisible(true);
	}
	
}
public class Menu {
	public static void main(String args[]) {
		new Menu_Bar();	
	}
}
