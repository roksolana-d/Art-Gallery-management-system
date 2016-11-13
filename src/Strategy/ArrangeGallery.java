package Strategy;

/**
 * Concrete behaviour(arrange gallery) implements abstract GalleryUserBehaviour
 * @author Dyachuk Roksolana
 *
 */
public class ArrangeGallery implements GalleryUserBehaviour{

	/**
	 * Implementation of abstract method execute for a manager
	 */
	@Override
	public void execute()
	{
		System.out.println("I am a manager. All I need to od is to hang and order the paintings");
	}
}
