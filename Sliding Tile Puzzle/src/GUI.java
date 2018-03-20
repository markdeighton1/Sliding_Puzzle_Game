import javax.swing.*;
import java.awt.*;
import java.awt.Event.*;

public class GUI {

	ImageIcon[] bartArray = new ImageIcon[12];
	
	public GUI()
	{
		
		JFrame aFrame = new JFrame();
		JPanel aPanel =  new JPanel(new FlowLayout(FlowLayout.LEFT));
		
		aPanel.add(bartArray[0]);
		
	}
	
}
