package Command;

/**
 * GalleryManager represents command invoker 
 * using reference to ICommand interface
 * @author Dyachuk Roksolana
 *
 */
public class GalleryManager {

	private ICommand command;
	
	/**
	 * Concrete command setter
	 * @param command
	 */
	public void setCommand(ICommand command)
	{
		this.command = command;
	}
	
	/**
	 * Executes predefined commands
	 */
	public void orderPaintings()
	{
		command.execute();
	}
}
