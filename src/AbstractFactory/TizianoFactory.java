package AbstractFactory;
/**
 * * Concrete factory for creation of Tiziano paintings
 * from abstract class Abstract Factory 
 * which purpose is creating paintings of High Renaissance style
 * @author Roksolana Dyachuk 217 group
 *
 */
public class TizianoFactory implements HighRenaissancePaintingFactory{

	/**
	 * create Tiziano painting object 
	 * @return HightRenaissancePainting type
	 */
	@Override
	public HighRenaissancePainting addNewPainting() 
	{
		return new TizianoPainting();
	}
}
