import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.ArrayList;
import java.awt.Graphics2D;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JColorChooser;
/**
 * Write a description of class DrawingPanel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DrawingPanel extends JPanel
{
    /** description of instance variable x (add comment for each instance variable) */
//     private SelectListener select;
//     private DragListener move;
    //private ArrowListener compass;
    private ArrayList<Shape> shownShapes;
    private int activeShape;
    private boolean isShapePicked;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        super();
//         this.select=new SelectListener();
//         this.move=new DragListener();
        //this.compass=new ArrowListener();
        this.setBackground(Color.WHITE);
        this.shownShapes=new ArrayList<Shape>();
        this.activeShape=0;
        this.isShapePicked=false;
//         this.addMouseListener(this.select);
//         this.addMouseMotionListener(this.move);
        //this.addKeyListener(this.compass);
    }
    public Color getColor()
    {  
        return Color.BLUE;
    }
    public Dimension getPreferredSize()
    {
        Dimension pref= new Dimension(500,350);
        return pref;
    }
    public void pickColor()
    {
        
    }
    public void addCircle()
    {
        double x=this.getPreferredSize().getWidth()/2;
        double y=this.getPreferredSize().getHeight()/2;
        Point2D.Double center= new Point2D.Double(x,y);
        Circle child=new Circle(center,50,this.getColor());
    }
    public void addSquare()
    {
        double x=this.getPreferredSize().getWidth()/2;
        double y=this.getPreferredSize().getHeight()/2;
        Point2D.Double center= new Point2D.Double(x,y);
        Square child=new Square(center,50,this.getColor());
    }
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D) g;
//         if (this.isShapePicked)
//         {
//             Shape active= this.shownShapes.get(this.activeShape);
//             this.shownShapes.remove(this.activeShape);
//             for(int i=this.shownShapes.size()-1;i>=0;i--)
//             {
//                 this.shownShapes.get(i).draw(g2,true);
//             }
//             active.draw(g2,false);
//             this.shownShapes.add(active);
//         }
//         else
//         {
            for (int i=this.shownShapes.size()-1;i>=0;i--)
            {
                this.shownShapes.get(i).draw(g2,true);
            }
        //}
    }
//         public class SelectListener implements MouseListener
//     {
//     
//     }
//         public class DragListener implements MouseMotionListener
//     {
//         
// 
//     
//     }
//         public class ArrowListener implements KeyListener
//     {
//         
// 
//     
//     }

}
