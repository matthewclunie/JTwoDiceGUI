// Chapter 4 Game Zone 227

public class Die
{
	// Data field variables for this class
	private int dieValue;
	private final int HIGHEST_DIE_VALUE = 6;
	private final int LOWEST_DIE_VALUE = 1;

	// Constructor Method for this class
	public Die()
	{
		dieValue = (int) (Math.random() * HIGHEST_DIE_VALUE + LOWEST_DIE_VALUE);
	}

	//Accessor / Getter Method for the dieValue
	public int getDieValue()
	{
		return dieValue;
	}
}