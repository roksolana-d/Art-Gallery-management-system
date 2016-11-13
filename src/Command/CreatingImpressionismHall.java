package Command;

/**
 * Represents command for creating Impressionism paintings hall 
 * implements ICommand interface
 * using reference to Gallery class
 * @author Dyachuk Roksolana
 *
 */
public class CreatingImpressionismHall  implements ICommand{
	Gallery gallery;
	
	public CreatingImpressionismHall(Gallery gallery)
	{
		this.gallery = gallery;
	}
	
	/**
	 * Executes this command using method from Gallery class
	 */
	@Override
	public void execute() 
	{
		gallery.createImpressionismHall();
	}

}
