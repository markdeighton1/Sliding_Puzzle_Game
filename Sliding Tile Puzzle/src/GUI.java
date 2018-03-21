import javax.swing.*;
import java.awt.*;

public class GUI 
{

	private ImageIcon[] bartIArray = new ImageIcon[12];
	private JButton[] bartBArray = new JButton[12];
	
	public void addTo()
	{
		for(int i = 0; i < 12; i ++)
		{
			bartIArray[i] = new ImageIcon("bin/bart" + i +  ".jpg");
			bartBArray[i] = new JButton(bartIArray[i]);
		}	
	}
	
	public void drawGUI()
	{
		
		JFrame aFrame = new JFrame();
		JPanel aPanel =  new JPanel(new GridLayout(3,4));
		
		
		for(int i = 0; i < 12; i++)
		{
			aPanel.add(bartBArray[i]);
		}
		
		aFrame.setContentPane(aPanel);
		aFrame.setTitle("Swingin' Simpsons");
		aFrame.setResizable(false);
		aFrame.setVisible(true);
		aFrame.setSize(450,400);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
