import org.junit.Test;

/**
 * @author Virgil Mayberry
 * @author Robert Dreier
 * 
 * assigned 09-05-2013
 * 
 * Bowling Score calculator
 *
 */
public class BowlingLineTest
{

	@Test
	public void gameCreationTest()
	{
		RunBowlingLine game1 = new RunBowlingLine();
		
		System.out.println(game1.getRollsForFrame(1) + "1");
		System.out.println(game1.getRollsForFrame(2) + "2");
		System.out.println(game1.getRollsForFrame(3) + "3");
		System.out.println(game1.getRollsForFrame(1) + "4");
		System.out.println(game1.getRollsForFrame(2) + "5");
		System.out.println(game1.getRollsForFrame(3) + "6");
		System.out.println(game1.getRollsForFrame(1) + "7");
		System.out.println(game1.getRollsForFrame(2) + "8");
		System.out.println(game1.getRollsForFrame(3) + "9");
		System.out.println(game1.getRollsForFrame(10) + "10");
		
			
		
	}
}
