package Bridge;

import Command.ICommand;

/**
 * Abstract class of bridge concrete implementation
 * It references to AbstractGallery as the highest level of abstraction
 * Also, it inserts commands to the remote control right in the constructor
 * @author Dyachuk Roksolana
 *
 */
public abstract class RemoteControl {

	public AbstractGallery gallery;
	
	public RemoteControl(AbstractGallery gallery, ICommand command)
	{
		this.gallery = gallery;
		this.insert(command);
	}
	
	/**
	 * Execute gallery commands on remote control by numbers
	 * @param num
	 */
	public void executebyNumber(int num)
	{
		this.gallery.executeByNumber(num);
	}
	
	/**
	 * Insert commands into remote control
	 * @param command
	 */
	public void insert(ICommand command)
	{
		gallery.insert(command);	
	}
}
