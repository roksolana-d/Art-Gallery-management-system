package Command;

/**
 * Represents command for creating Baroque paintings hall 
 * implements ICommand interface
 * using reference to Gallery class
 * @author Dyachuk Roksolana
 *
 */
public class CreatingBaroqueHall implements ICommand{
	Gallery gallery;
	
	public CreatingBaroqueHall(Gallery gallery)
	{
		this.gallery = gallery;
	}
	
	/**
	 * Executes this command using method from Gallery class
	 */
	@Override
	public void execute() 
	{
		gallery.createBaroqueHall();
	}

}
