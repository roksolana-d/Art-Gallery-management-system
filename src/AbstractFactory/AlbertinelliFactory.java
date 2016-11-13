package AbstractFactory;

/**
 * Concrete factory for creation of Albirtinelli paintings 
 * from abstract class Abstract Factory 
 * which purpose is creating paintings of High Renaissance style
 * @author Roksolana Dyachuk 217 group
 *
 */
public class AlbertinelliFactory implements HighRenaissancePaintingFactory{

	/**
	 * create Albertinelli painting object 
	 * @return HightRenaissancePainting type
	 */
	@Override
	public HighRenaissancePainting addNewPainting() 
	{
		return new AlbertinelliPainting();
	}

}
