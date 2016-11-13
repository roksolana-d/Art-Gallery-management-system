package Strategy;

/**
 * Abstract class which defines abstract user type
 * It performs some operations using reference to the GalleryUserBehaviour
 * @author Dyachuk Roksolana
 *
 */
public abstract class GalleryAppUser {
	GalleryUserBehaviour user_behaviour;
	
	public GalleryAppUser()
	{
		
	}
	
	/**
	 * Sets particular behaviour for an object
	 * @param u_b - abstract behaviour
	 */
	public void setUserBehaviour(GalleryUserBehaviour u_b)
	{
		user_behaviour = u_b;
	}
	
	/**
	 * Performs operation that is setted in the behavioural interface
	 */
	public void performOperation()
	{
		user_behaviour.execute();
	}
}
