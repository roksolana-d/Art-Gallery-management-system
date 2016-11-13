package AbstractFactory;

/**
 * Concrete decorator class GoldenFrame
 * extends Decorator, defines type of painting in constructor
 * and implements getDescription() method
 * @author Dyachuk Roksolana
 *
 */
public class GoldenFrame extends Decorator{

	private HighRenaissancePainting painting;
	
	public GoldenFrame(HighRenaissancePainting p)
	{
		painting = p;
	}

	/**
	 * Get detailed description of painting with addition(decorator)
	 * @return string
	 */
	@Override
	public String getDescription() 
	{
		return painting.getDescription() + "In a golden frame";
	}
}
