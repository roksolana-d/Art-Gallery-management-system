package AbstractFactory;

/**
 * * Concrete factory for creation of Bartolomeo paintings 
 * from abstract class Abstract Factory 
 * which purpose is creating paintings of High Renaissance style
 * @author Roksolana Dyachuk 217 group
 *
 */

public class BartolomeoFactory implements HighRenaissancePaintingFactory{

	/**
	 * create Bartolomeo painting object 
	 * @return HightRenaissancePainting type
	 */
	@Override
	public HighRenaissancePainting addNewPainting() 
	{
		return new BartolomeoPainting();
	}

}
