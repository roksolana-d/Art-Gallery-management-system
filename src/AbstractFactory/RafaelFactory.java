package AbstractFactory;

/**
 * * Concrete factory for creation of Rafael paintings
 * from abstract class Abstract Factory 
 * which purpose is creating paintings of High Renaissance style
 * @author Roksolana Dyachuk 217 group
 *
 */

public class RafaelFactory implements HighRenaissancePaintingFactory{

	/**
	 * create Rafael painting object 
	 * @return HightRenaissancePainting type
	 */
	@Override
	public HighRenaissancePainting addNewPainting() 
	{
		return new RafaelPainting();
	}

}
