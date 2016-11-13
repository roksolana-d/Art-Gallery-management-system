package VisitorProxy;
import Singleton.Fireplace;

/**
 * Class for fireplace hall implementing ItemsCollection interface
 * with only one object
 * @author Dyachuk Roksolana
 *
 */
public class FireplaceHall implements ItemsCollection{

	/**
	 * Accept visitor
	 */
	@Override
	public String accept(GalleryVisitor visitor) 
	{
		return null;
	}

	
	/**
	 * Output information about single fireplace object
	 */
	@Override
	public void addItems() 
	{
		Fireplace fireplace = Fireplace.getInstance();
		fireplace.showInfo();
	}
}
