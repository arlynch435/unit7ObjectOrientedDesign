import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
/**
 * Write a description of class ControlPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ControlPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private JButton pickColor;
    private JButton newCircle;
    private JButton newSquare;
    private JPanel colorDisplay;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel d)
    {
        super();
        this.canvas=d;
        this.pickColor=new JButton("Pick Color");
        this.colorDisplay=new JPanel();
        this.colorDisplay.setBackground(this.canvas.getColor());
        this.newCircle=new JButton("Add Circle");
        this.newSquare=new JButton("Add Square");
        ClickListener listener=new ClickListener();
        this.pickColor.addActionListener(listener);
        this.newCircle.addActionListener(listener);
        this.newSquare.addActionListener(listener);
        this.add(this.pickColor);
        this.add(this.colorDisplay);
        this.add(this.newCircle);
        this.add(this.newSquare);
    }
        public class ClickListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            //System.out.println(event.getActionCommand()+" was pressed!");
            if ("Pick Color".equals(event.getActionCommand()))
            {
                canvas.pickColor();
                colorDisplay.setBackground(canvas.getColor());
            }
            if ("Add Circle".equals(event.getActionCommand()))
            {
                canvas.addCircle();
                canvas.repaint();
            }
            if ("Add Square".equals(event.getActionCommand()))
            {
                canvas.addSquare();
                canvas.repaint();
            }
        }
    
    }

}
