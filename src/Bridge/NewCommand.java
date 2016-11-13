package Bridge;
import Command.ICommand;

/**
 * Concrete implementation of the bridge concrete level extends RemoteControl class
 * creates new commans on the remote control using super constructor
 * @author Dyachuk Roksolana
 *
 */
public class NewCommand extends RemoteControl{

	public NewCommand(AbstractGallery gallery, ICommand command)
	{
		super(gallery,command);
	}
	
	/**
	 * Execute particular command on the remote control by number
	 * @param number
	 */
	public void executeByNumber(int number) 
	{
		gallery.executeByNumber(number);
	}
}
