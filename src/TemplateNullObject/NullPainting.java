package TemplateNullObject;

/**
 * Null painting  extended from template BaroquePainting
 * implements setter methods without parameters for creating null object
 * @author Dyachuk Roksolana
 *
 */
public class NullPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.print("No available name in a gallery database");
	}

	@Override
	public void setAuthor() 
	{
		System.out.print("No available author in the gallery database");
	}

	@Override
	public void setSize() 
	{
		System.out.print("No available size information in the gallery database");
	}

	@Override
	public void setYear() 
	{
		System.out.print("No available years information in the gallery database");
	}

	@Override
	public boolean isNull() 
	{
		return true;
	}

}
