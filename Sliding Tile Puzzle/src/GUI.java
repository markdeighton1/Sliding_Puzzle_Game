import javax.swing.*;
import java.awt.*;

public class GUI 
{

	private ImageIcon[] bartIArray = new ImageIcon[12];
	private JButton[] bartBArray = new JButton[12];
	private int BlankTile = 0;
	
	public int getBlankTile() {
		return BlankTile;
	}

	public void setBlankTile(int blankTile) {
		BlankTile = blankTile;
	}
	
	public void addTo()
	{
		
		Swap c = new Swap(this); // create instance of swap
		
		for(int i = 0; i < 12; i ++)
		{
			getBartIArray()[i] = new ImageIcon("bin/bart" + i +  ".jpg");
			getBartBArray()[i] = new JButton(getBartIArray()[i]);
			getBartBArray()[i].addActionListener(c);
		}	
	}
	
	public JButton[] getBartBArray() {
		return bartBArray;
	}

	public void setBartBArray(JButton[] bartBArray) {
		this.bartBArray = bartBArray;
	}
	
	
	public void drawGUI()
	{
		
		JFrame aFrame = new JFrame();
		JPanel aPanel =  new JPanel(new GridLayout(3,4));
		
		
		for(int i = 0; i < 12; i++)
		{
			aPanel.add(getBartBArray()[i]);
		}
		
		aFrame.setContentPane(aPanel);
		aFrame.setTitle("Swingin' Simpsons");
		aFrame.setResizable(false);
		aFrame.setVisible(true);
		aFrame.setSize(450,400);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public ImageIcon[] getBartIArray() {
		return bartIArray;
	}

	public void setBartIArray(ImageIcon[] bartIArray) {
		this.bartIArray = bartIArray;
	}
	
}
