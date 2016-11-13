package TemplateNullObject;

/**
 * Concrete painting by Caracci extended from template BaroquePainting
 * implements setter methods without parameters for creating an object
 * Is not Null
 * @author Dyachuk Roksolana
 *
 */
public class CarracciPainting extends BaroquePainting{

	@Override
	public void setName() 
	{
		System.out.println("Venus, Adonis and Cupid ");
	}

	@Override
	public void setAuthor() 
	{
		System.out.println("Annibale Carracci");
	}

	@Override
	public void setSize() 
	{
		System.out.println("212 * 268 sm");
	}

	@Override
	public void setYear()
	{
		System.out.println("1595");
	}

	@Override
	public boolean isNull() 
	{
		return false;
	}
}
