package Java547;
import java.awt.*;
import javax.swing.*;
class Border{
	JFrame f;
	Border(){
		f= new JFrame();
		f.add(new Button("DOG"),BorderLayout.NORTH);
		f.add(new Button("CAT"),BorderLayout.SOUTH);
		f.add(new Button("FISH"),BorderLayout.EAST);
		f.add(new Button("PEACOCK"),BorderLayout.WEST);
		f.add(new Button("PARROT"),BorderLayout.CENTER);
		f.setSize(500,500);
		f.setVisible(true);
	}
}
public class Border_Layout {
	public static void main(String args[])
	{
		new Border();
	}
}
