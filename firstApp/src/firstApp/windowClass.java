package firstApp;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Lenovo-Pc on 6/29/2016.
 */
public class windowClass extends JPanel {
    int i = 0;
    int j = 0;

    public void runAnimate(){
        while(i<=260){
            i++;
            try{
                Thread.sleep(1000);
                System.out.print("Paint");
            } catch (InterruptedException e){

            }
            repaint();
        }
    }


    public void paintComponent(Graphics g){
        runAnimate();
        g.setColor(Color.YELLOW);
        g.fillRect(0,0,500,500);
        g.setColor(Color.blue);
        g.fillArc(i,i,50,50,35,290);
        g.fillArc(450,0,50,50,215,290);
        g.fillArc(0,450,50,50,35,290);
        g.fillArc(450,450,50,50,215,290);
    }
}
