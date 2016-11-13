package TemplateNullObject;

/**
 * Concrete painting by Barocci extended from template BaroquePainting
 * implements setter methods without parameters for creating an object
 * Is not Null
 * @author Dyachuk Roksolana
 *
 */
public class BarocciPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.println("Martyrdom of St Sebastian");
	}

	@Override
	public void setAuthor() 
	{
		System.out.println("Federico Barocci");
	}

	@Override
	public void setSize() 
	{
		System.out.println("405 * 225 sm");
	}

	@Override
	public void setYear()
	{
		System.out.println("1558");
	}

	@Override
	public boolean isNull() 
	{
		return false;
	}

}
