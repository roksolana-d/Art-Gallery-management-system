package AbstractFactory;

/**
 * Factories generator class which references to HighReneissancePainting
 * @author Dyachuk Roksolana
 *
 */
public class PaintingApp {

	private HighRenaissancePainting painting;
	
	/**
	 * Defines and redefines painting factories 
	 * that would be used for paintings creation
	 * using painting setter
	 * @param factory
	 */
	public void addnewPainting(HighRenaissancePaintingFactory factory)
	{
		setPainting(factory.addNewPainting());
	}
	
	/**
	 * Creates painting using particular factory
	 * @param factory
	 * @return painting of High Renaissance type
	 */
	public HighRenaissancePainting getPainting(HighRenaissancePaintingFactory factory)
	{
		return factory.addNewPainting();	
	}
	
	/**
	 * Painting getter
	 * @return
	 */
	public HighRenaissancePainting getPainting()
	{
		return painting;
	}
	
	/**
	 * Painting setter
	 * @param painting
	 */
	public void setPainting(HighRenaissancePainting painting)
	{
		this.painting = painting;
	}
}
