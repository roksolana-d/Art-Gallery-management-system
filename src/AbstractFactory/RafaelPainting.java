package AbstractFactory;

/**
 * Concrete class for creation of Rafael painting 
 * extended from abstract class HighRenaissancePainting
 * which purpose is creating particular painting by Rafael
 * @author Roksolana Dyachuk 217 group
 *
 */

public class RafaelPainting extends HighRenaissancePainting{

	public RafaelPainting()
	{
		name = "Madonna of the meadow";
		author = "Raffaello Santi";
		size = "113 * 88,5";
		year1 = 1505;
		year2 = 1506;
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
		display.append("The painting was created in: " + year1 + "-" + year2 + " \n");
		
		return display.toString();
	}
}
