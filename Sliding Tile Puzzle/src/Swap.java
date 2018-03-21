import java.awt.event.*;

import javax.swing.ImageIcon;

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
				
				Swap.getBartBArray()[Swap.BlankTile].setIcon(Swap.getBartBArray()[i].getIcon());
				Swap.getBartBArray()[i].setIcon(Swap.getBartIArray()[0]);
				Swap.BlankTile = i;
				
			}
			
		}
		
		
	}
}
