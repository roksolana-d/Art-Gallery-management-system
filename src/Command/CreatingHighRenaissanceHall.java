package Command;

/**
 * Represents command for creating Renaissance paintings hall 
 * implements ICommand interface
 * using reference to Gallery class
 * @author Dyachuk Roksolana
 *
 */
public class CreatingHighRenaissanceHall implements ICommand{
	Gallery gallery;
	
	public CreatingHighRenaissanceHall(Gallery gallery)
	{
		this.gallery = gallery;
	}
	
	/**
	 * Executes this command using method from Gallery class
	 */
	@Override
	public void execute() 
	{
		gallery.createHighRenaissanceHall();
	}

}
