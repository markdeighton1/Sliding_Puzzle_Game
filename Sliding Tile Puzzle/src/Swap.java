import java.awt.event.*; //import for ActionEvent(pretty self explanatory)

public class Swap implements ActionListener // Implements ActionListener(pretty self explanatory)
{
	GUI Swap; // Declare variable to refer to object
	
	//Constructor so an instance of Swap can be created
	public Swap(GUI c) 
	{
		Swap = c; 
	}
	
	//Create action performed method
	public void actionPerformed(ActionEvent ActionEvent) 
	{
		//For loop to iterate over every button in array
		for(int i = 0; i < 12; i++)
		{
			//Checks which button in the Array has been clicked
			if(ActionEvent.getSource() == Swap.getBartBArray()[i])
			{
				// Only move to adjacent tiles, -1 = left, +1 = right, -4 = row up, +4 = row down
				if(i == Swap.getBlankTile() -1 || i == Swap.getBlankTile() +1 ||i == Swap.getBlankTile() -4 || i == Swap.getBlankTile() +4)
				{
					//This code simply swaps icons, gets array tile, gets blank tile sets blank tile to image
					Swap.getBartBArray()[Swap.getBlankTile()].setIcon(Swap.getBartBArray()[i].getIcon()); 
					//Sets Image to blank tile
					Swap.getBartBArray()[i].setIcon(Swap.getBartIArray()[0]);
					//Updates postion of blank tile
					Swap.setBlankTile(i);
				}
			}
			
		}
	}
}
