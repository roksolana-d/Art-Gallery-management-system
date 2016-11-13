package AbstractFactory;

/**
 * Concrete class for creation of Coreggio painting 
 * extended from abstract class HighRenaissancePainting
 * which purpose is creating particular painting by Coreggio
 * @author Roksolana Dyachuk 217 group
 *
 */
public class CoreggioPainting extends HighRenaissancePainting{

	public CoreggioPainting()
	{
		name = "Mystic Marriage of Saint Catherine with Saint Sebastian";
		author = "Antonio de Coreggio";
		size = "105 * 102 cm";
		year1 = 1526;
		year2 = 1527;
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
		display.append("Size: " + size + " cm\n");
		display.append("The painting was created in: " + year1 + "-" + year2 + " \n");
		
		return display.toString();
	}
}
