package TemplateNullObject;

/**
 * Concrete painting by Vermeer extended from template BaroquePainting
 * implements setter methods without parameters for creating an object
 * Is not Null
 * @author Dyachuk Roksolana
 *
 */
public class VermeerPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.println("The Allegory of Painting");
	}

	@Override
	public void setAuthor() 
	{
		System.out.println("Johannes Vermeer");
	}

	@Override
	public void setSize() 
	{
		System.out.println("120 * 100 sm");
	}

	@Override
	public void setYear()
	{
		System.out.println("1665-1666");
	}

	@Override
	public boolean isNull() 
	{
		return false;
	}

}
