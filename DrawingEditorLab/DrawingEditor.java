import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
public class DrawingEditor extends JFrame
{
    /** description of instance variable x (add comment for each instance variable) */
    private static final int FRAME_WIDTH=800;
    private static final int FRAME_HEIGHT=800;

    /**
     * Default constructor for objects of class DrawingEditor
     */
    public DrawingEditor()
    {
        super();
        this.setSize(FRAME_WIDTH,FRAME_HEIGHT);
        DrawingPanel canvas=new DrawingPanel();
        ControlPanel controls=new ControlPanel(canvas);
        this.setLayout(new BorderLayout());
        this.add(canvas,BorderLayout.CENTER);
        this.add(controls,BorderLayout.SOUTH);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setTitle("Drawing Editor");
    }
    public static void main(String[] args)
    {
        DrawingEditor window= new DrawingEditor();
    }

}
