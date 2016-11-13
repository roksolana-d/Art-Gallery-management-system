package TemplateNullObject;

/**
 * Concrete painting by Velazquez extended from template BaroquePainting
 * implements setter methods without parameters for creating an object
 * Is not Null
 * @author Dyachuk Roksolana
 *
 */
public class VelazquezPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.println("Portrait of Infanta Margarita Teresa in a Blue Dress");
	}

	@Override
	public void setAuthor() 
	{
		System.out.println("Diego Velazquez");
	}

	@Override
	public void setSize() 
	{
		System.out.println("127 * 107 sm");
	}

	@Override
	public void setYear()
	{
		System.out.println("1659");
	}

	@Override
	public boolean isNull() 
	{
		return false;
	}
	
}
