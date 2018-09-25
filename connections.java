/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package connections;

/**
 *
 * @author A Rakavee
 */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class connections extends JFrame{

JLabel label,label2,label3;

JTextField name;

JButton display;


JPanel upperPanel,panel1;
 String[] a={"res\1.gif","2.jpg","3.jpg","4.jpg","5.jpg","6.jpg","7.jpg","8.png","9.jpg","10.jpg","11.jpg","12.png","13.jpg","14.png","15.jpg","16.jpg","17.png","congrats.jpg"};
   // int flag=0;
    int i=0;
    String[] answer={"chennaiexpress","noone","italy","ipl","tip","cristianoronaldo","timesquare","hungary","converse","hike","enjoy","mario","hewlettpackard","hideandseek","milk","icegola","anchor"};
public timer time;

connections()
	{

super("Connections");
label=new JLabel("Enter the answer here: ");
label.setBounds(30, 50, 150, 20);
label2=new JLabel();
time=new timer(label2);
label2.setBounds(400, 0, 50, 50);
label3=new JLabel("Time left:");
label3.setBounds(300, 0, 60, 50);
name=new JTextField(15);
name.setBounds(200, 50, 100 ,20);
display=new JButton("SUBMIT");
display.setBounds(350, 50, 100  ,20);

DrawPanel panel=new DrawPanel();

display.addActionListener(panel);

upperPanel=new JPanel();

setLayout(null);
upperPanel.setLayout(null);
upperPanel.add(label);
upperPanel.add(label3);
upperPanel.add(name);
upperPanel.add(display);
upperPanel.setBounds(400, 600, 1000, 100);

add(upperPanel);
panel.setBounds(400, 70, 500, 500);
add(panel);
            }




private class DrawPanel extends JPanel implements ActionListener{

	Image image;

        public void actionPerformed(ActionEvent e)
	{
if(time.flag==1){
            }
else{
	String text=name.getText();
if(text.equals("start")){
 image=new ImageIcon(a[0]).getImage();
 upperPanel.add(label2);
}
if(text.equals(answer[i])){
image=new ImageIcon(a[++i]).getImage();
            }
else
image=new ImageIcon(a[i]).getImage();
repaint();
            }


}

public void paintComponent(Graphics g)
	{


g.fillRect(10,10,500,500);

g.drawImage(image,0,0,this);


}
}
}

