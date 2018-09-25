/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connections;

/**
 *
 * @author A Rakavee
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NewClass extends JFrame
 {
   NewClass()
  {
  setDefaultCloseOperation(javax.swing.
   WindowConstants.DISPOSE_ON_CLOSE);
  setTitle("Welcome");
  setSize(400, 200);
   }

  }


class newc extends JFrame implements ActionListener
 {
  JButton SUBMIT;
  JPanel panel;
  JLabel label1,label2;

   newc()
   {
   SUBMIT=new JButton("START TO PLAY  !!");
   SUBMIT.setBounds(580, 600, 200, 40);
 //  JFrame frame=new JFrame();
 
java.net.URL imageURL=newc.class.getResource("/final.jpg");

   ImagePanel pane = new ImagePanel(new ImageIcon(imageURL).getImage());
    System.out.println("e");
   pane.setBounds(50,50,1250,500);
   panel=new JPanel(null);
   panel.add(SUBMIT);
   panel.add(pane);
   add(panel,BorderLayout.CENTER);
   SUBMIT.addActionListener(this);
   setTitle("WELCOME TO CONNECTIONS!");
   }
  public void actionPerformed(ActionEvent ae)
   {

 connections img=new connections();

img.setSize(1500,800);

img.setVisible(true);

img.setDefaultCloseOperation(EXIT_ON_CLOSE);

img.setResizable(true);
dispose();

 }

 }

 public class Main
 {
   public static void main(String arg[])
   {
   try
   {
       System.out.println("a");
    newc frame=new newc();
     System.out.println("b");
   frame.setSize(1500,900);
    System.out.println("c");
   frame.setVisible(true);
    System.out.println("d");
   }
   catch(Exception e)
   {JOptionPane.showMessageDialog(null, "ERROR");}
   }
  }
class ImagePanel extends JPanel {

  private Image img;

  public ImagePanel(String img) {
    this(new ImageIcon(img).getImage());
  }

  public ImagePanel(Image img) {
    this.img = img;
    Dimension size = new Dimension(img.getWidth(null), img.getHeight(null));
    setPreferredSize(size);
    setMinimumSize(size);
    setMaximumSize(size);
    setSize(size);
    setLayout(null);
  }

  @Override
  public void paintComponent(Graphics g) {
    g.drawImage(img, 0, 0, null);
  }
}
