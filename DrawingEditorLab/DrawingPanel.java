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
    private SelectListener select;
    private DragListener move;
    private ArrowListener compass;
    private ArrayList<Shape> shownShapes;
    private int activeShape;
    private boolean isShapePicked;
    private Color shapeColor;
    private boolean changeRadius;

    /**
     * Default constructor for objects of class DrawingPanel
     */
    public DrawingPanel()
    {
        super();
        this.setFocusable(true);
        this.select=new SelectListener();
        this.move=new DragListener();
        this.compass=new ArrowListener();
        this.requestFocusInWindow();
        this.setBackground(Color.WHITE);
        this.shownShapes=new ArrayList<Shape>();
        this.activeShape=-1;
        this.isShapePicked=false;
        this.shapeColor=Color.BLUE;
        this.addMouseListener(this.select);
        this.addMouseMotionListener(this.move);
        this.addKeyListener(this.compass);
    }
    public Color getColor()
    {  
        return this.shapeColor;
    }
    public Dimension getPreferredSize()
    {
        Dimension pref= new Dimension(800,500);
        return pref;
    }
    public void pickColor()
    {
        JColorChooser colorChooser=new JColorChooser();
        Color newColor=null;
        newColor=colorChooser.showDialog(this,"Pick Color",this.shapeColor);
        if (newColor!=null)
        {
            this.shapeColor=newColor;
        }
    }
    public void addCircle()
    {
        double x=this.getPreferredSize().getWidth()/2;
        double y=this.getPreferredSize().getHeight()/2;
        Point2D.Double center= new Point2D.Double(x,y);
        Circle child=new Circle(center,50,this.getColor());
        this.shownShapes.add(child);
    }
    public void addSquare()
    {
        double x=this.getPreferredSize().getWidth()/2;
        double y=this.getPreferredSize().getHeight()/2;
        Point2D.Double center= new Point2D.Double(x,y);
        Square child=new Square(center,50,this.getColor());
        this.shownShapes.add(child);
    }
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        Graphics2D g2= (Graphics2D) g;
        if (this.isShapePicked)
        {
            Shape active= this.shownShapes.get(this.activeShape);
            this.shownShapes.remove(this.activeShape);
            for(int i=0;i<this.shownShapes.size();i++)
            {
                this.shownShapes.get(i).draw(g2,true);
            }
            active.draw(g2,false);
            this.shownShapes.add(active);
        }
        else
        {
            for (int i=0;i<this.shownShapes.size();i++)
            {
                this.shownShapes.get(i).draw(g2,true);
            }
        }
    }
        public class SelectListener implements MouseListener
    {
        public void mouseClicked(MouseEvent event)
        {
          // Invoked when the mouse button has been clicked (pressed and released) on a component.
        }
        public void mouseEntered(MouseEvent event)
        {
          // Invoked when the mouse enters a component.

        }
        public void mouseExited(MouseEvent event)
        {
          // Invoked when the mouse exits a component.
        }
        public void mousePressed(MouseEvent event)
        {
          // Invoked when a amouse button has been pressed on a component.
           double xPos=event.getX();
          double yPos=event.getY();
          Point2D.Double mousePos=new Point2D.Double(xPos,yPos);
          int i=shownShapes.size()-1;
          isShapePicked=false;
          while (isShapePicked==false&&i>=0)
          {
              if (shownShapes.get(i).isInside(mousePos))
              {
                  activeShape=i;
                  isShapePicked=true;
                }
                else
                {
                    i=i-1;
                    activeShape=-1;
                }
           }
           requestFocusInWindow();
           repaint();
           if (isShapePicked)
             changeRadius=shownShapes.get(shownShapes.size()-1).isOnBorder(mousePos);
        }
        public void mouseReleased(MouseEvent event)
        {
          // Invoked when a mouse button has been released on a component.
        }
        
    
    }
        public class DragListener implements MouseMotionListener
    {
        public void mouseDragged(MouseEvent event)
        {
            //use this one
            double xPos=event.getX();
            double yPos=event.getY();
            Point2D.Double mousePos=new Point2D.Double(xPos,yPos);
            select.mousePressed(event);
//             if(isShapePicked)
//                shownShapes.get(shownShapes.size()-1).move(event.getX(),event.getY());
            
            if (isShapePicked&&!changeRadius)
            {
               shownShapes.get(activeShape).move(event.getX(),event.getY());
            }
            else if (isShapePicked&&changeRadius)
            {
                double distance=Math.abs(shownShapes.get(activeShape).getCenter().distance(mousePos));
                shownShapes.get(activeShape).setRadius(distance);
            }
            repaint();
        }
        public void mouseMoved(MouseEvent event)
        {
        }
    }
        public class ArrowListener implements KeyListener
    {
       public void  keyPressed(KeyEvent event)
       {
           //Invoked when a key has been pressed.
           if (isShapePicked)
           {
               Point2D.Double center=shownShapes.get(activeShape).getCenter();
               if (event.getKeyCode()==KeyEvent.VK_W)
               {
                   shownShapes.get(shownShapes.size()-1).move(center.getX(),center.getY()-5);
                }
               else if (event.getKeyCode()==KeyEvent.VK_S)
               {
                   shownShapes.get(shownShapes.size()-1).move(center.getX(),center.getY()+5);
                }
               else if (event.getKeyCode()==KeyEvent.VK_A)
               {
                   shownShapes.get(shownShapes.size()-1).move(center.getX()-5,center.getY());
                }
               else if (event.getKeyCode()==KeyEvent.VK_D)
               {
                   shownShapes.get(shownShapes.size()-1).move(center.getX()+5,center.getY());
                }
               repaint();
            }
       }
       public void  keyReleased(KeyEvent event)
       {
           //Invoked when a key has been released.
        }
       public void  keyTyped(KeyEvent event)
       {
           //Invoked when a key has been typed.
        }

    }

}
