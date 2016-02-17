import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class CircleViewer2
{
    private static final int FRAME_WIDTH=800;
    private static final int FRAME_HEIGHT=800;
    private JFrame frame;
    private CircleComponent2 circle;
    private JOptionPane input;
    public CircleViewer2()
    {
        this.frame=new JFrame();
        DoneListener drawListener=new DoneListener();
        this.circle=new CircleComponent2();
        this.input= new JOptionPane();
        Dimension circleWin=new Dimension(800,800);
        this.circle.setPreferredSize(circleWin);
        this.circle.addMouseListener(drawListener);
        this.frame.add(this.circle);
        this.frame.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.frame.setVisible(true);
    }
    public static void main(String[] args)
    {
        CircleViewer2 view=new CircleViewer2();
    }
        public class DoneListener implements MouseListener
    {
        public DoneListener()
        {
        }
        public void mousePressed(MouseEvent event)
         {// Called when a mouse button has been pressed on a component
            }
        public void mouseReleased(MouseEvent event)
         {// Called when a mouse button has been released on a component
            }
        public void mouseClicked(MouseEvent event)
        {// Called when the mouse has been clicked on a component
            String ansRad=input.showInputDialog("Enter your radius: ");
            circle.addRadius(Integer.parseInt(ansRad));
            circle.addX(event.getX());
            circle.addY(event.getY());
            circle.repaint();
           }
        public void mouseEntered(MouseEvent event)
         {// Called when the mouse enters a component
            }
        public void mouseExited(MouseEvent event)
         {// Called when the mouse exits a component 
            }
    }

}
