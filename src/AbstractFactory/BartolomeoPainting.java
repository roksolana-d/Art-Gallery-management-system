package AbstractFactory;

/**
 * Concrete class for creation of Bartolomeo painting 
 * extended from abstract class HighRenaissancePainting
 * which purpose is creating particular painting by Bartolomeo
 * @author Roksolana Dyachuk 217 group
 *
 */
public class BartolomeoPainting extends HighRenaissancePainting{

	public BartolomeoPainting()
	{
		name = "The Scene of Christ in the Temple";
		author = "Fra Bartolomeo";
		size = "155 * 159";
		year1 = 1516;
		year2 = 1516;
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
