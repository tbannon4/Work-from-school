package gui;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
public class SimplePanel extends JPanel 
{
    private int width;
    private int height;
    public SimplePanel() 
    {
        width = 0;
        height = 0;
    }
    public SimplePanel(int width, int height)
    {
        this.width = width;
        this.height = height;
        setBackground(Color.gray);
    }
    public void paintComponent(Graphics g) 
    {
        super.paintComponent(g);
        g.setColor(Color.darkGray);
        width = getWidth();
        height = getHeight();
        //upper left is (0,0)
        g.drawLine(width / 2, 0, width / 2, height);
        g.drawLine(0, height / 2, width, height / 2);
        g.setColor(Color.cyan);
        g.fillOval(0, 0, width / 2, height / 2);
        g.setColor(Color.lightGray);
        g.drawOval(width / 2, 0, width / 2, height / 2); 
        g.setColor(Color.green);
        g.fillRect(width / 2, height / 2, width / 2, height / 2);
        g.setColor(Color.pink);
        g.drawRect(0, height / 2, width / 2, height);
    }
}