package Java547;
import java.awt.*;
import javax.swing.*;
public class Flow_Layout  
{   
JFrame frameObj;  
Flow_Layout()  
{     
    frameObj = new JFrame();    
    JButton b1 = new JButton("A");    
    JButton b2 = new JButton("B");    
    JButton b3 = new JButton("C");    
    JButton b4 = new JButton("D");    
    frameObj.add(b1); frameObj.add(b2); frameObj.add(b3); frameObj.add(b4);       
    frameObj.setLayout(new FlowLayout());       
    frameObj.setSize(300, 300);    
    frameObj.setVisible(true);    
}    
public static void main(String argvs[])   
{    
    new Flow_Layout();    
}    
}    