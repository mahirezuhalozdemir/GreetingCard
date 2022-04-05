
package grap2d;

import java.io.IOException;
import javax.swing.*;

public class MyFrame extends JFrame{
 
 MyPanel panel;
 
 MyFrame() throws IOException{
  
  panel = new MyPanel();
  
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.add(panel);
  this.pack();
  this.setLocationRelativeTo(null);
  this.setVisible(true);
 }  
}