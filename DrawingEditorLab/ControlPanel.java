import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
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
    private JButton color;
    private JButton circle;
    private JButton square;
    private JPanel colorDisplay;
    private DrawingPanel canvas;

    /**
     * Default constructor for objects of class ControlPanel
     */
    public ControlPanel(DrawingPanel d)
    {
        super();
        this.canvas=d;
        this.color=new JButton("Pick Color");
        this.colorDisplay=new JPanel();
        //this.colorDisplay.setBackgroundColor(this.canvas.getColor());
        this.circle=new JButton("Add Circle");
        this.square=new JButton("Add Square");
        ClickListener listener=new ClickListener();
        this.color.addActionListener(listener);
        this.circle.addActionListener(listener);
        this.square.addActionListener(listener);
        this.add(this.color);
        this.add(this.colorDisplay);
        this.add(this.circle);
        this.add(this.square);
    }
        public class ClickListener implements ActionListener
    {
        
        public void actionPerformed(ActionEvent event)
        {
            System.out.println(event.getActionCommand()+" was pressed!");
            if ("Pick Color".equals(event.getActionCommand()))
            {
                canvas.pickColor();
            }
            if ("Add Circle".equals(event.getActionCommand()))
            {
                canvas.addCircle();
            }
            if ("Add Square".equals(event.getActionCommand()))
            {
                canvas.addSquare();
            }
        }
    
    }

}
