package TemplateNullObject;

/**
 * Concrete painting by Caravaggio extended from template BaroquePainting
 * implements setter methods without parameters for creating an object
 * Is not Null
 * @author Dyachuk Roksolana
 *
 */
public class CaravaggioPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.println("Salome with the Head of John the Baptist");
	}

	@Override
	public void setAuthor() 
	{
		System.out.println("Michelangelo Merisi da Caravaggio");
	}

	@Override
	public void setSize() 
	{
		System.out.println("116 * 140 cm");
	}

	@Override
	public void setYear()
	{
		System.out.println("1609");
	}

	@Override
	public boolean isNull() 
	{
		return false;
	}

}
