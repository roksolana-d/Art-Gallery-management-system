package Strategy;

/**
 * Concrete behaviour(visit gallery) implements abstract GalleryUserBehaviour
 * @author Dyachuk Roksolana
 *
 */
public class VisitGallery implements GalleryUserBehaviour{

	/**
	 * Implementation of abstract method execute for a visitor
	 */
	@Override
	public void execute()
	{
		System.out.println("I am a visitor. All I want is to visit this nice new gallery");
	}
}
