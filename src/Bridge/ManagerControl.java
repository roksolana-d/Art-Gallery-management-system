package Bridge;
import java.util.ArrayList;
import java.util.List;

import Command.ICommand;

/**
 * Concrete implementation of abstract bridge level
 * with array list for holding commands and performing operations with them
 * @author Dyachuk Roksolana
 *
 */
public class ManagerControl extends AbstractGallery{

	List<ICommand>  commands = new ArrayList<ICommand>();
	private static ManagerControl control = new ManagerControl();
	 
	private ManagerControl()
	{}
		 
	/**
	 * Static method for getting control over the gallery
	 * @return
	 */
	public static ManagerControl getControl()
	{
		return control;
	}
	
	/**
	 * Add particular command to the gallery system
	 * Increase number of commands in array list respectively
	 * @param command
	 */
	 public void addCommand(ICommand command)
	 {
		 commands.add(command);
		 comm++;
	 }
	 
	 /**
	  * Execute particular commands by numbers
	  * @param num
	  */
	 public void executebyNumber(int num)
	 {
		 commands.get(num).execute(); 
	 }

}
