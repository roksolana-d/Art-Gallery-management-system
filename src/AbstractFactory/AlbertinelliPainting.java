package AbstractFactory;

/**
 * Concrete class for creation of Albirtinelli painting 
 * extended from abstract class HighRenaissancePainting
 * which purpose is creating particular painting by Albertinelli
 * @author Roksolana Dyachuk 217 group
 *
 */
public class AlbertinelliPainting extends HighRenaissancePainting{

	public AlbertinelliPainting()
	{
		name = "The Madonna and Child with Saint John the Baptist";
		author = "Mariotto Albertinelli";
		size = "49.5 * 31.1";
		year1 = 1506;
	}
	
	/**
	 * Get detailed description(name, author, size, year) of the painting 
	 * that was initialized in constructor
	 * @return description of string type
	 */
	@Override
	public String getDescription() 
	{
		StringBuffer display = new StringBuffer();
		display.append("_________Painting_________\n");
		display.append("Name: " + name + "\n");
		display.append("Author: " + author + "\n");
		display.append("Size: " + size + " sm\n");
		display.append("The painting was created in: " + year1 + " \n");
		
		return display.toString();
	}
}
