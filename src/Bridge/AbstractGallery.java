package Bridge;

/**
 * Abstract representation of the Abstract Bridge level
 * This class defines some abstract gallery with array list for commands
 * @author Dyachuk Roksolana
 */
import java.util.ArrayList;
import java.util.List;
import Command.ICommand;

public class AbstractGallery {

	List<ICommand> commands = new ArrayList<ICommand>();
	static int comm;
	
	/**
	 * Insert some command of ICommand type
	 * @param command
	 */
	public void insert(ICommand command)
	{
		commands.add(command);
	}
	
	/**
	 * Execute commands by numbers
	 * @param number
	 */
	public void executeByNumber(int number)
	{
		commands.get(number).execute();
	}
}
