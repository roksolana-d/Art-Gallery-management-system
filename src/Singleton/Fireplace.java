package Singleton;

/**
 * Single representation of unique Fireplace object
 * It hides the constructor and creates only one instance of the class
 * which can be accessed only using static getInstance() method
 * @author user
 *
 */
public class Fireplace {

	private static Fireplace instance = new Fireplace();
	private Fireplace(){};
	
	public static Fireplace getInstance()
	{
		return instance;
	}
	
	/**
	 * Shows detailed information about the fireplace
	 */
	public void showInfo()
	{
		System.out.println("\n_________Fireplace_________");
		System.out.println("Authors: Giuseppe and Luidgi Valadier in 1786");
		System.out.println("Material: marble");
		System.out.println("Year: 1786");
	}
}
