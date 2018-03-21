import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class GUI 
{

	ImageIcon[] bartIArray = new ImageIcon[12];
	JButton[] bartBArray = new JButton[12];
	
	public GUI()
	{
		
		
		JFrame aFrame = new JFrame();
		JPanel aPanel =  new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		bartIArray[0] = new ImageIcon("/bart.jpg");
		bartBArray[0] = new JButton(bartIArray[0]);
		
		
		aPanel.add(bartBArray[0]);
		aFrame.setContentPane(aPanel);
		
	}
	
}
