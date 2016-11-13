package Command;

/**
 * Represents command for creating fireplace hall implementing ICommand interface
 * using reference to Gallery class
 * @author Dyachuk Roksolana
 *
 */
public class CreatingFireplaceHall implements ICommand {
	Gallery gallery;
	
	public CreatingFireplaceHall(Gallery gallery)
	{
		this.gallery = gallery;
	}
	
	/**
	 * Executes this command using method from Gallery class
	 */
	@Override
	public void execute() 
	{
		gallery.createFireplaceHall();
	}

}
