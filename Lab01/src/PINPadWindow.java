import java.awt.*; 
import javax.swing.*;

/**
 * A window containing a PIN entry pad.
 */
public class PINPadWindow extends JFrame 
{
    /**
     * Default Constructor.
     */
    public PINPadWindow()
    {
        super();
        setupLayout();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        pack();
        setResizable(false); 

    }

    /**
     * Setup and layout this PINPadWindow
     */
    private void setupLayout()
    {
        Container     contentPane;

        setSize(300, 300); 

        contentPane = getContentPane();
        

        //Adding a Display above NumberPad
        
        Display display = new Display();
        contentPane.add(display, BorderLayout.NORTH); 
        
        // Layout this PINPadWindow
        NumberPad obj1 = new NumberPad(display);
        contentPane.add(obj1);

        
        

       
    }
}
