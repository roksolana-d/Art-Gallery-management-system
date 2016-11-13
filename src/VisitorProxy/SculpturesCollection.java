package VisitorProxy;
import Command.Gallery;

/**
 * Class for collection of sculptures as a hall 
 * implements ItemsCollection interface
 * with array list with sculptures
 * @author Dyachuk Roksolana
 *
 */
public class SculpturesCollection implements ItemsCollection{

	/**
	 * Accept visitor
	 */
	@Override
	public String accept(GalleryVisitor visitor) 
	{
		return visitor.visit(this);
	}

	/**
	 * Output sculptures using method from Gallery class
	 */
	@Override
	public void addItems() 
	{
		Gallery gallery = new Gallery();
		//Iterator iterator = sculpture.createIterator();	
		gallery.createSculpturesHall();
	}
}
