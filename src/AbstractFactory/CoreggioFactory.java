package AbstractFactory;

/**
 * * Concrete factory for creation of Coreggio paintings
 * from abstract class Abstract Factory 
 * which purpose is creating paintings of High Renaissance style
 * @author Roksolana Dyachuk 217 group
 *
 */

public class CoreggioFactory implements HighRenaissancePaintingFactory{

	/**
	 * create Coreggio painting object 
	 * @return HightRenaissancePainting type
	 */
	@Override
	public HighRenaissancePainting addNewPainting() 
	{
		return new CoreggioPainting();
	}
}
