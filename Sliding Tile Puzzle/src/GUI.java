import javax.swing.*;
import java.awt.*;

public class GUI 
{

	ImageIcon[] bartIArray = new ImageIcon[12];
	JButton[] bartBArray = new JButton[12];
	
	public void add()
	{
		for(int i = 0; i < 12; i ++)
		{
			bartIArray[i] = new ImageIcon("bin/bart" + i +  ".jpg");
			bartBArray[i] = new JButton(bartIArray[i]);
		}
		
		
	}
	
	public GUI()
	{
		
		JFrame aFrame = new JFrame();
		JPanel aPanel =  new JPanel(new GridLayout(4,3));
		
		
		//bartIArray[0] = new ImageIcon("bin/bart0.jpg");
		//bartBArray[0] = new JButton(bartIArray[0]);
		
		for(int i = 0; i < 12; i++)
		{
			aPanel.add(bartBArray[i]);
		}
		
		//aPanel.add(bartBArray[i]);
		aFrame.setContentPane(aPanel);
		aFrame.setTitle("Swingin' Simpsons");
		aFrame.setVisible(true);
		aFrame.setSize(400,400);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
