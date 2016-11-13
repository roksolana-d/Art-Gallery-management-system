package BuilderPrototype;

/**
 * Abstract class which represents abstract builder
 * It holds abstract methods for building sculpture object by parts
 * @author Dyachuk Roksolana
 *
 */
public abstract class AbstractSculptureBuilder {
	protected AbstractSculpture sculpture;
	
	public abstract void setName(String s);
	public abstract void setName();
	public abstract void setAuthor();
	public abstract void setMaterial();
	public abstract void setMaterial(String m);
	public abstract void setHeight();
	public abstract void setHeight(int h);
	public abstract void setYear();
	public abstract void setYear(int y);
	
	/**
	 * Getter for concrete sculpture using some builder
	 * @return sculpture of AbstractSculpture type
	 */
	public AbstractSculpture getSculpture()
	{
		return sculpture;
	}
}
