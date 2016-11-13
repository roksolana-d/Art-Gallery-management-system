package FactoryMethodFlyweight;

/**
 * Abstract painting of Impressionism style defines parameters for object creation
 * @author user
 *
 */
public abstract class ImpressionismPainting {

	String name;
	String author;
	String size;
	int creation_year;
	
	/**
	 * Painting name getter
	 * @return
	 */
	public String get_name()
	{
		return name;
	}
	
	/**
	 * Outputs detailed description of impressionism style painting
	 * @return String
	 */
	public String toString()
	{
		StringBuffer display = new StringBuffer();
		display.append("\n________Painting________\n");
		display.append("Name: " + name + "\n");
		display.append("Author: " + author + "\n");
		display.append("Size: " + size + "\n");
		display.append("Year: " + creation_year + "\n");
		
		return display.toString();
	}
}
