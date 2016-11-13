package TemplateNullObject;

/**
 * Abstract painting of Baroque type or template for creating painting of Baroque style
 * It has abstract methods for painting creation to be implemented in concrete classes
 * Abstract methods for defininf if the painting is in the collection
 * @author Dyachuk Roksolana
 *
 */
public abstract class BaroquePainting {

	public abstract void setName();
	public abstract void setAuthor();
	public abstract void setSize();
	public abstract void setYear();
	public abstract boolean isNull();
	
	
	/**
	 * Creating object which is Null with description
	 */
	public final void collectNull()
	{
		System.out.println("\n_________Painting_________");
		System.out.print("\nName: ");
		setName();
		System.out.print("\nAuthor: ");
		setAuthor();
		System.out.print("\nSize: ");
		setSize();
		System.out.print("\nYear: ");
		setYear();
		System.out.println();
	}
	
	/**
	 * Creating painting of Baroque type
	 * with detailed description
	 */
	public final void collect()
	{
		System.out.println("\n_________Painting_________");
		System.out.print("Name: ");
		setName();
		System.out.print("Author: ");
		setAuthor();
		System.out.print("Size: ");
		setSize();
		System.out.print("Year: ");
		setYear();
	}
}
