package BuilderPrototype;

/**
 * Abstract class  with fields to be used in its implementations
 * implements Cloneable interface for creating clones of objects
 * It has abstract method getInfo() to be implemented in derived classes
 * @author Dyachuk Roksolana
 *
 */
public abstract class AbstractSculpture implements Cloneable{

	String name = "";
	String author = "";
	String material = "";
	int height;
	int appearance_year;
	
	public abstract void getInfo();
	
	/**
	 * Creates shallow copy of AbstractSculpture object
	 * @return copy of Object type
	 */
	public Object clone()
	{
		try
		{
			return super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			return null;
		}
	}
}
