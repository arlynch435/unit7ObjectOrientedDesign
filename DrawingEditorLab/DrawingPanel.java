import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
    private SelectListener select;
    private DragListener move;
    private ArrowListener compass;
    //private ArrayList<Shape> shownShapes;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        super();
        this.select=new SelectListener();
        this.move=new DragListener();
        this.compass=new ArrowListener();
        //this.shownShapes=new ArrayList<Shape>;
        this.addMouseListener(this.select);
        this.addMouseMotionListener(this.move);
        this.addKeyListener(this.compass);
    }
    public void getColor()
    {
        
    }
    public void pickColor()
    {
        
    }
    public void addCircle()
    {
        
    }
    public void addSquare()
    {
        
    }
        public class SelectListener implements MouseListener
    {
    
    }
        public class DragListener implements MouseMotionListener
    {
        

    
    }
        public class ArrowListener implements KeyListener
    {
        

    
    }

}
