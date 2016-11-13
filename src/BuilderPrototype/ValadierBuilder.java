package BuilderPrototype;

/**
 * Concrete builder extended from abstract builder for sculptures by Valadier
 * sets particular parameters (name, material, author, height, appearance year) for sculpture object
 * Parameters can be set by default or manually using methods with parameters
 * @author Dyachuk Roksolana
 *
 */
public class ValadierBuilder extends AbstractSculptureBuilder{

	public ValadierBuilder(AbstractSculpture sculpture)
	{
		this.sculpture = sculpture;
	}
	
	@Override
	public void setName(String s) 
	{
		this.sculpture.name = s;
	}

	@Override
	public void setName() 
	{
		this.sculpture.name = "Herma Vakha";
	}
	
	@Override
	public void setAuthor() 
	{
		this.sculpture.author = "Luigi Valadier";
	}

	@Override
	public void setMaterial() 
	{
		this.sculpture.material = "bronze";
	}

	@Override
	public void setMaterial(String m) 
	{
		this.sculpture.material = m;
	}
	
	@Override
	public void setHeight() 
	{
		this.sculpture.height = 175;
	}
	
	@Override
	public void setHeight(int h) 
	{
		this.sculpture.height = h;
	}

	@Override
	public void setYear(int y) 
	{
		this.sculpture.appearance_year = y;
	}
	
	@Override
	public void setYear() 
	{
		this.sculpture.appearance_year = 1773;
	}

}
