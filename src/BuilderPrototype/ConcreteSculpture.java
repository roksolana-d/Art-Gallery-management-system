package BuilderPrototype;

/**
 * Concrete implementation of AbstractSculpture class
 * creates new collector for objects creating
 * @author user
 *
 */
public class ConcreteSculpture extends AbstractSculpture{
	Collector collector;
	
	public ConcreteSculpture()
	{
		collector = new Collector();
	}
	
	/**
	 * Outputs detailed information (name, author, material, height, appearance_year)
	 * about sculpture
	 */
	public void getInfo()
	{
		System.out.println("_________Sculpture_________");
		System.out.println("Name: " + name + "\nAuthor: " + author + "\n" 
		+ "Material: " + material + " \n" + "Height: " + height + " sm\n"
		+ "The sculpture was created in: "+ appearance_year + " \n");	
	}
}
