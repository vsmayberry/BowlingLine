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
/*
 * this class contains the game information as a whole
 * it contains one array of scores and one array of objects representing individual frames
 * 
 */
public abstract class BowlingLine implements IBowlingLine
{

	//instance variables
	ArrayList<Frame> game;//collection of frames that make up the entire game
	ArrayList<Integer> score;
	int indexScore = 0;
	int totalScore=0;
	int throwCount=0;
	private int currentFrame = 0;	// initialize current frame to the first frame or index 0 in game array
	
	//default constructor
	public BowlingLine()
	{
		game = new ArrayList<Frame>(11);
		score = new ArrayList<Integer>(0);
		
		for(int i=0; i<5; i++)
		{
			score.add(i, 0);
		}
		
		for(int i=0; i<10; i++)
		{
			Frame element = new Frame(i);
			game.add(element);
		}
	}
	
		
	public int getCurrentFrame()
	{
		return currentFrame;
	}

	public void setCurrentFrame(int currentFrame)
	{
		this.currentFrame = currentFrame;
	}
		
	public int scoreAtFrame(int frame)
	{
		if(canShowScoreFrame(frame)==false)
			return 0;
		
		return 0;
	}
	
	public int totalScore()
	{
		int total=0;
		for(int i=0; i<23; i+=2)
		{
			if(score.get(i)==10)
			{
				total = total + 10 + score.get(i+2) + score.get(i+3);
			} 
			else if(score.get(i) +score.get(i+1)==10)
			{
				total = total + 10 + score.get(i+2);
			}
			else
			{
				total = total;
			}
			
		}
		
		System.out.println("The line below is the score");
		System.out.println(total);
		return total;
	}
	
	public void pinsDowned(int pins)
	{
		totalScore(pins);
		int roll1 = game.get(getCurrentFrame()).getRoll1();
		int roll2 = game.get(getCurrentFrame()).getRoll2();
		int roll3 = game.get(getCurrentFrame()).getRoll3();
		
		if(getCurrentFrame() != 9)
		{
			if(roll1<0)
			{
				game.get(getCurrentFrame()).setRoll1(pins);
				score.set(indexScore, pins);
				indexScore++;
			}
			else
			{
				game.get(getCurrentFrame()).setRoll2(pins);
				score.set(indexScore, pins);
				indexScore++;
			}
				
		}
		else
		{
			if(roll1<0)
			{
				game.get(getCurrentFrame()).setRoll1(pins);
				score.set(indexScore, pins);
				indexScore++;
			}
			else if(roll2<0)
			{
				game.get(getCurrentFrame()).setRoll2(pins);
				score.set(indexScore, pins);
				indexScore++;
			}
			else if((roll1+roll2)>=10)
			{
				game.get(getCurrentFrame()).setRoll3(pins);
				score.set(indexScore, pins);
				indexScore++;
			}
		}
		
		

	}
	 
	public boolean canShowScoreFrame(int frame)
	{
		int roll1 = game.get(getCurrentFrame()).getRoll1();
		int roll2 = game.get(getCurrentFrame()).getRoll2();
		int roll3 = game.get(getCurrentFrame()).getRoll3();
		
		if(roll1==10 || roll1<0) return false;
		if(roll1 + roll2 == 10) return false;
		
		return true;
	}
	
	public boolean isNotValidRoll(int pinsTemp)
	{
		int roll1 = game.get(getCurrentFrame()).getRoll1();
		int roll2 = game.get(getCurrentFrame()).getRoll2();
		int roll3 = game.get(getCurrentFrame()).getRoll3();
		
		if(pinsTemp>10 || pinsTemp<0) return true;
		if(roll1>=0)
		{
			if(pinsTemp > 10-roll1 || pinsTemp<0)
			{	
				return true;
			}
		}
				
		return false;
	}
	
	
	public void totalScore(int pinsTemp)
	{
		totalScore = totalScore + pinsTemp;
		int total=totalScore;
		
		score.add(throwCount,pinsTemp);
		throwCount++;
		for(int i=0; i<score.size()-3; i+=2)
		{
			if(score.get(i)==10)
			{
				total = total + score.get(i+2) + score.get(i+3);
			} 
			else if(score.get(i) +score.get(i+1)==10)
			{
				total = total + score.get(i+2);
			}
			
		}
		
		System.out.println("The line below is the score");
		System.out.println(total);
		System.out.println(score);
		return;
		
//		keeps score correctly without spares and strikes
//		totalScore = 0;
//		int i = currentFrame;
//		score.add(pinsTemp);
//		for(i = 0; i<score.size(); i++)
//		{
//			if(score.get(i)==10)
//			{
//				if(score.get(i+1) != null && score.get(i+2) != null)
//				totalScore = totalScore + score.get(i+2) +score.get(i+3);
//			}
//
//			else
//			{
//				totalScore = totalScore + pinsTemp;
//			}
//		}
		
		
		
	}

	
	public abstract String getRollsForFrame(int frame);
	public abstract int pinsLeftToDown();
	public abstract boolean gameOver();
	
	
}//end BowlingLine Class
