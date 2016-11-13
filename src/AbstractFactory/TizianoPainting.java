package AbstractFactory;

/**
 * Concrete class for creation of Tiziano painting 
 * extended from abstract class HighRenaissancePainting
 * which purpose is creating particular painting by Tiziano
 * @author Roksolana Dyachuk 217 group
 *
 */
public class TizianoPainting extends HighRenaissancePainting{

	public TizianoPainting()
	{
		name = "The Death of Actaeon";
		author = "Tiziano Vecelli";
		size = "178.4 * 198.1 ";
		year1 = 1559;
		year2 = 1575;
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
