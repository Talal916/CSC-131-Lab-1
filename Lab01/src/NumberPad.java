import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * A numeric keypad
 */
public class NumberPad extends  JPanel 
{
    private ActionListener listener;
	/**
     * Default Constructor
     */
    public NumberPad(ActionListener obj)
    {
        super();
    	this.listener = obj;
        setupLayout();
    }

    /**
     * Setup and layout this NumberPad
     */
    private void setupLayout()
    {
        // Setup and layout this NumberPad
    	//setting gridlayout
    	 setLayout(new GridLayout(4,3));
    	
        for(int i=0; i < 9; i++)
        {
        	createButton(Integer.toString(i));

        }
        createButton("Del");
        createButton("0");
        createButton("C");

        
    }
    private void createButton(String buttonName)
    {
    	JButton button = new JButton(buttonName);
    	add(button);
    	button.addActionListener(listener);
    }
}
