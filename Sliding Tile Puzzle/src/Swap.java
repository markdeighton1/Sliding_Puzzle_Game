import java.awt.event.*;

public class Swap implements ActionListener 
{
	GUI Swap; // Declare variable to refer to object
	
	public Swap(GUI c) 
	{
		Swap = c;
	}
	
	public void actionPerformed(ActionEvent ActionEvent) 
	{
		
		
		for(int i = 0; i < 12; i++)
		{
			
			
			if(ActionEvent.getSource() == Swap.getBartBArray()[i])
			{
				
			}
			
		}
		
		
	}
}
