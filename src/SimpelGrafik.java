import javax.swing.*;
import java.awt.*;

public class SimpelGrafik extends Canvas {
    public SimpelGrafik(){
        JFrame frame = new JFrame("En simpel grafik");
        this.setSize(800,600);
        frame.add(this);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public void paint(Graphics g){
        g.setColor(Color.black);
        g.fillRect(200,200,88,20);
        g.setColor(new Color(255,127,0));
        drawTree(g,100,200);
    }

    private void drawTree(Graphics g, int x, int y) {
        g.setColor(Color.GREEN);
        int[] xs = {0+x,10+x,20+x};
        int[] ys = {30+y,0+y,30+y};
        g.fillPolygon(xs,ys,3);
        g.setColor(new Color(200,128,30));
        g.fillRect(7,30,6,10);
    }

    public static void main(String[] args) {
        SimpelGrafik painting = new SimpelGrafik();
    }
}