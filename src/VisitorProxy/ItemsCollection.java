package VisitorProxy;

/**
 * Interface for collection of items
 * With abstract method for items adding
 * And method for visitors accepting
 * @author user
 *
 */
public interface ItemsCollection {
	
	public String accept(GalleryVisitor visitor);
	public abstract void addItems();
}
