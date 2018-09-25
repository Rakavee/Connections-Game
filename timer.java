package connections;

import javax.swing.*;
class timer extends Thread
{
JLabel text;
int sec=2700,min=45,flag=0;
timer(JLabel jd)
{
text=jd;
start();
}
public void run()
{
while(sec>0)
{
text.setText(min+":"+(sec%60));
sec--;
min=sec/60;
if(sec==1&&min==0) flag=1;
try
{
sleep(1000);
}
catch(Exception e)
{}
}
}
}