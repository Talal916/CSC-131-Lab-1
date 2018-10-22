import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Display extends JLabel implements ActionListener
{
	private String screen;
	private final String clearButton = "C";
	private final String delButton = "Del";
	
	public Display()
	{
		super(" ",SwingConstants.RIGHT);
		setBorder(BorderFactory.createEtchedBorder());
		screen = "";
		screenDisplay();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String action = e.getActionCommand();
		
		if(action.equals(clearButton))
		{
			setText(" ");
			screen = "";
		}
		else if(action.equals(delButton))
		{
			if(!screen.equals(""))
				screen = screen.substring(0,screen.length()-1);
		}
		else
		{
			screen = screen + action;
			screenDisplay();
		}	
		screenDisplay();
	}
	private void screenDisplay()
	{
		String hiddenPIN = "";
		if(screen.equals(""))
		{
			setForeground(Color.gray);
			setText("Enter your PIN");
		}
		else
		{
			for(int i=0; i < screen.length(); i++)
			{
				setForeground(Color.red);
				hiddenPIN = hiddenPIN + "*";
				setText(hiddenPIN);
			}
		}
	}
}
