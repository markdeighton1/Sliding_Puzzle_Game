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
				if(i == Swap.getBlankTile() -1 || i == Swap.getBlankTile() +1 ||i == Swap.getBlankTile() -4 || i == Swap.getBlankTile() +4)
				{
					Swap.getBartBArray()[Swap.getBlankTile()].setIcon(Swap.getBartBArray()[i].getIcon());
					Swap.getBartBArray()[i].setIcon(Swap.getBartIArray()[0]);
					Swap.setBlankTile(i);
				}
			}
			
		}
		
		
	}
}
