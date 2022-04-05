
package grap2d;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.imageio.*;
import javax.swing.*;

public class MyPanel extends JPanel{

 
 MyPanel() throws IOException{
  
  
  
  Image image = new ImageIcon("frame.jpg").getImage(); 
    this.setPreferredSize(new Dimension(874,602));
    BufferedImage bufferedImage = ImageIO.read(new File("frame.jpg")); 
    BufferedImage scaledBI = new BufferedImage(874, 602, BufferedImage.TYPE_INT_RGB); 
    paint(scaledBI,image);
 }
 
 public void paint(BufferedImage scaledBI,Image image) {
  
    
  Graphics2D g2D = scaledBI.createGraphics();
  g2D.drawImage(image, 0, 0, null);

         String line;
         try{
   FileReader dosya=new FileReader("names.txt");
   BufferedReader oku=new BufferedReader(dosya);
   line=oku.readLine();
   int i=1;
   while(line!=null)
   {
       g2D.setPaint(Color.RED);
       g2D.setFont(new Font("TimesRoman",Font.BOLD,50));
       g2D.drawString(line, 180,274);  
       ImageIO.write(scaledBI, "jpg",new File("out"+i+".jpg"));
       i++;
       g2D = scaledBI.createGraphics();
        g2D.drawImage(image, 0, 0, null);
    line=oku.readLine();
   }
   oku.close();
  }catch(IOException e)
  {
   System.out.println(e.getMessage());
  }
         System.exit(0);
     




     
     
     
		  
  
  

 }
}