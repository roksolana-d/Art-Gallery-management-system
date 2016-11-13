package Command;

/**
 * Represents command for creating sculptures hall 
 * implements ICommand interface
 * using reference to Gallery class
 * @author Dyachuk Roksolana
 *
 */
public class CreatingSculpturesHall implements ICommand{
	Gallery gallery;
	
	public CreatingSculpturesHall(Gallery gallery)
	{
		this.gallery = gallery;
	}
	
	/**
	 * Executes this command using method from Gallery class
	 */
	@Override
	public void execute() 
	{
		gallery.createSculpturesHall();
	}

}
