package AbstractFactory;

/**
 * Abstract class for paintings of High Renaissance type
 * with abstract method for getting description about this painting
 * @author Dyachuk Roksolana 
 *
 */
public abstract class HighRenaissancePainting {

	String name;
	String author;
	String size;
	int year1;
	int year2;
	
	public abstract String getDescription();
}
