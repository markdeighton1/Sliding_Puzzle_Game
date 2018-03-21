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
		
		for(int i = 0; i < 12; i ++)
		{
			bartIArray[i] = new ImageIcon("bin/bart" + i +  ".jpg");
			bartBArray[i] = new JButton(bartIArray[i]);
		}
		
		
		//bartIArray[0] = new ImageIcon("bin/bart0.jpg");
		//bartBArray[0] = new JButton(bartIArray[0]);
		
		
		aPanel.add(bartBArray[0]);
		aFrame.setContentPane(aPanel);
		
		aFrame.setVisible(true);
		aFrame.setSize(400,400);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
