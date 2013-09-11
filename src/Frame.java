import java.util.ArrayList;

/**
 * @author Virgil Mayberry
 * @author Robert Dreier
 * 
 * assigned 09-05-2013
 * 
 * Bowling Score calculator
 *
 */
public class Frame
{
	
	//instance variables
	private int roll1 = -1;
	private int roll2 = -1;
	private int roll3 = -1;
	private boolean isTenthFrame = false;
	private int leftToDown = 10;
	ArrayList<Integer> score;//an array that stores the score as the game progresses
	
	
	//constructor
	public Frame(int frameNumber)
	{
		if(frameNumber<9)
		{
			this.isTenthFrame = false;
		}
		else 
		{
			this.isTenthFrame = true;
		}
	}



	public boolean isTenthFrame()
	{
		return isTenthFrame;
	}



	public void setTenthFrame(boolean isTenthFrame)
	{
		this.isTenthFrame = isTenthFrame;
	}



	public int getRoll1()
	{
		return roll1;
	}

	public void setRoll1(int roll1)
	{
		this.roll1 = roll1;
	}

	public int getRoll2()
	{
		return roll2;
	}

	public void setRoll2(int roll2)
	{
		this.roll2 = roll2;
	}

	public int getRoll3()
	{
		return roll3;
	}

	public void setRoll3(int roll3)
	{
		this.roll3 = roll3;
	}
	
	
	
}
