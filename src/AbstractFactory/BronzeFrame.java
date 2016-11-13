package AbstractFactory;

/**
 * Concrete decorator class BronzeFrame
 * extends Decorator, defines type of painting in constructor
 * and implements getDescription() method
 * @author Dyachuk Roksolana
 *
 */
public class BronzeFrame extends Decorator{

	private HighRenaissancePainting painting;
	
	public BronzeFrame(HighRenaissancePainting p)
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
		return painting.getDescription() + "In a bronze frame";
	}
}
