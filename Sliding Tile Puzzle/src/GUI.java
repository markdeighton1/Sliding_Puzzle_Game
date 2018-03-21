import javax.swing.*; //Import for swing functions
import java.awt.*; //Import for layout functions

//Please don't make me explain this
public class GUI 
{

	private ImageIcon[] bartIArray = new ImageIcon[12]; //Private instance variable of ImageIcon array (set to 12 as there are 12 images) 
	private JButton[] bartBArray = new JButton[12]; //Private instance variable of JButton array (set to 12 as there are 12 images
	private int BlankTile = 0; //Private instance variable of BlankTile int to store the position of the blank tile
	
	//As BlankTile is private, it needs a get method so that it can be used
	public int getBlankTile() {
		return BlankTile;
	}

	//As BlankTile is private, it needs a set method so that it can be edited
	public void setBlankTile(int blankTile) {
		BlankTile = blankTile;
	}
	
	//addTo method to add buttons to the JFrame 
	public void addTo()
	{
		
		Swap c = new Swap(this); // create instance of swap
		
		for(int i = 0; i < 12; i ++) //Loop that iterates 12 times for the 12 images
		{
			//Store image thats from bin which name is bart + n number + .jpg into the array
			getBartIArray()[i] = new ImageIcon("bin/bart" + i +  ".jpg"); 
			//Set each image onto each button
			getBartBArray()[i] = new JButton(getBartIArray()[i]);
			//When button is clicked it will call the instance of swap 
			getBartBArray()[i].addActionListener(c);
		}	
	}
	
	//As BartBArray is private, it needs a get method so that it can be used
	public JButton[] getBartBArray() {
		return bartBArray;
	}
	//As BartBArray is private, it needs a set method so that it can be edited
	public void setBartBArray(JButton[] bartBArray) {
		this.bartBArray = bartBArray;
	}
	
	
	//method that draws the GUI
	public void drawGUI()
	{
		
		JFrame aFrame = new JFrame(); //Creates a new Frame
		JPanel aPanel =  new JPanel(new GridLayout(3,4)); //Creates a panel which has a layout of 3 rows and 4 columns
		
		
		for(int i = 0; i < 12; i++) //Loop that iterates 12 times for the 12 buttons
		{
			aPanel.add(getBartBArray()[i]); //add buttons to the panel
		}
		
		aFrame.setContentPane(aPanel); //set the content pane of the frame to the panel
		aFrame.setTitle("Swingin' Simpsons"); //set the title to "Swingin' Simpsons"
		aFrame.setResizable(false); //disable resizing of the window
		aFrame.setVisible(true); //sets the frame to visible
		aFrame.setSize(450,400); //sets the size to 450, 400, seems to be perfect for the images
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Speaks for itself
		
	}
	//As BartIArray is private, it needs a set method so that it can be used
	public ImageIcon[] getBartIArray() {
		return bartIArray;
	}
	//As BartIArray is private, it needs a set method so that it can be edited
	public void setBartIArray(ImageIcon[] bartIArray) {
		this.bartIArray = bartIArray;
	}
	
}