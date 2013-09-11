import java.util.Scanner;


public class RunBowlingLine extends BowlingLine
{

	@Override
	public String getRollsForFrame(int frame)
	{

		int pinsTemp = 99;
		String tempString = "";
		setCurrentFrame(frame-1);
		
		pinsTemp = getUserInput();
		
		
		pinsDowned(pinsTemp);	
			
		if(pinsLeftToDown()>0)
		{
			pinsTemp = getUserInput();
			pinsDowned(pinsTemp);
			//tempString = editString(tempString);
		}
		else if(frame == 10 && (game.get(getCurrentFrame()).getRoll1() ==10))
		{
			pinsTemp = getUserInput();
			pinsDowned(pinsTemp);
			//tempString = editString(tempString);
		}
		else if(frame == 10 && (game.get(getCurrentFrame()).getRoll1() + game.get(getCurrentFrame()).getRoll2() >=10))
		{
			pinsTemp = getUserInput();
			totalScore(pinsTemp);
			pinsDowned(pinsTemp);
			//tempString = editString(tempString);
		}
		
		
		tempString = editString(tempString, frame);
		
		
		//if not tenthframe then only two rolls to print else three rolls
		
		
			
		return tempString;

	}



	//this method gets the roll from the user and verifies its validity
	private int getUserInput()
	{
		int pinsTemp = 99;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Roll: ");
		pinsTemp = scanner.nextInt();
		System.out.println();
		
		while(isNotValidRoll(pinsTemp))//check roll number validity
		{
			System.out.println("Is not a valid roll, try again.");
			System.out.print("Enter new Roll: ");
			
			pinsTemp = scanner.nextInt();
			System.out.println();
			
		}
		
		return pinsTemp;
	}

	//returns character to append to the end of the frame string
	private String editString(String tempString, int frame)
	{
		
		if(game.get(getCurrentFrame()).getRoll1()==0)
		{
			tempString = tempString + '0';
		}
		if(game.get(getCurrentFrame()).getRoll1()==1)
		{
			tempString = tempString + '1';
		}
		if(game.get(getCurrentFrame()).getRoll1()==2)
		{
			tempString = tempString + '2';
		}
		if(game.get(getCurrentFrame()).getRoll1()==3)
		{
			tempString = tempString + '3';
		}
		if(game.get(getCurrentFrame()).getRoll1()==4)
		{
			tempString = tempString + '4';
		}
		if(game.get(getCurrentFrame()).getRoll1()==5)
		{
			tempString = tempString + '5';
		}
		if(game.get(getCurrentFrame()).getRoll1()==6)
		{
			tempString = tempString + '6';
		}
		if(game.get(getCurrentFrame()).getRoll1()==7)
		{
			tempString = tempString + '7';
		}
		if(game.get(getCurrentFrame()).getRoll1()==8)
		{
			tempString = tempString + '8';
		}
		if(game.get(getCurrentFrame()).getRoll1()==9)
		{
			tempString = tempString + '9';
		}
		if(game.get(getCurrentFrame()).getRoll1()==10)
		{
			tempString = tempString + 'X';
		}
		if(frame!=9)
		{
			tempString = tempString + ' ';	
		}
		
		
		
///////////////////////////
		if(game.get(getCurrentFrame()).getRoll1() + game.get(getCurrentFrame()).getRoll2()==10)
		{
			tempString = tempString + '/';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==0)
		{
			tempString = tempString + '0';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==1)
		{
			tempString = tempString + '1';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==2)
		{
			tempString = tempString + '2';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==3)
		{
			tempString = tempString + '3';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==4)
		{
			tempString = tempString + '4';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==5)
		{
			tempString = tempString + '5';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==6)
		{
			tempString = tempString + '6';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==7)
		{
			tempString = tempString + '7';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==8)
		{
			tempString = tempString + '8';
		}
		else if(game.get(getCurrentFrame()).getRoll2()==9)
		{
			tempString = tempString + '9';
		}
		else
		{
			tempString = tempString + ' ';
		}
//////////////////////////
		if(game.get(getCurrentFrame()).getRoll3() + game.get(getCurrentFrame()).getRoll2()==10)
		{
			tempString = tempString + '/';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==0)
		{
			tempString = tempString + '0';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==1)
		{
			tempString = tempString + '1';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==2)
		{
			tempString = tempString + '2';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==3)
		{
			tempString = tempString + '3';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==4)
		{
			tempString = tempString + '4';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==5)
		{
			tempString = tempString + '5';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==6)
		{
			tempString = tempString + '6';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==7)
		{
			tempString = tempString + '7';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==8)
		{
			tempString = tempString + '8';
		}
		else if(game.get(getCurrentFrame()).getRoll3()==9)
		{
			tempString = tempString + '9';
		}
		else
		{
			tempString = tempString + ' ';
		}
		return tempString;
	
	}

	@Override
	public int pinsLeftToDown()
	{
		if(getCurrentFrame()<=9)
		{	
				if(game.get(getCurrentFrame()).getRoll1() == -1)
				{
					return 10;
				}
				else 
					return 10 - game.get(getCurrentFrame()).getRoll1();
				
		}
		else
			return 0;
	}

	@Override
	public boolean gameOver()
	{
		if(getCurrentFrame() > 9)
			return true;
		else
			return false;
	}

}
