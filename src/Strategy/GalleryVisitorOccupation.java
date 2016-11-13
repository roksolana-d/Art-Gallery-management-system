package Strategy;

import VisitorProxy.BaroqueCollection;
import VisitorProxy.FireplaceHall;
import VisitorProxy.GalleryVisitor;
import VisitorProxy.HighRenaissanceCollection;
import VisitorProxy.ImpressionismCollection;
import VisitorProxy.ProxyVisitor;
import VisitorProxy.SculpturesCollection;

/**
 * Concrete user(visitor) extended from abstract GalleryAppUser
 * The particular behaviour for this user is defines in the constructor
 * @author Dyachuk Roksolana
 *
 */
public class GalleryVisitorOccupation extends GalleryAppUser{

	public GalleryVisitorOccupation()
	{
		user_behaviour = new VisitGallery();
	}
	
	/**
	 * Visits halls with paintings of different styles(types) 
	 * using Visitor and Proxy patterns implementation
	 * Expert, Artlover and Regular teenager visit halls they are interested in
	 * They get access not for all of them
	 * They can express their opinion about the art objects
	 */
	@Override
	public void performOperation() 
	{
		HighRenaissanceCollection high_renaissance = new HighRenaissanceCollection();
		HighRenaissanceCollection high_renaissance2 = new HighRenaissanceCollection();
		ImpressionismCollection impressionism = new ImpressionismCollection();
		BaroqueCollection baroque = new BaroqueCollection();
		BaroqueCollection baroque2 = new BaroqueCollection();
		SculpturesCollection sculptures = new SculpturesCollection();
		SculpturesCollection sculptures2 = new SculpturesCollection();
		FireplaceHall fireplace = new FireplaceHall();
		
		System.out.println("\n__________First visitors go to the gallery__________");
		System.out.println("\nThe expert visits gallery");
		GalleryVisitor visitor = new ProxyVisitor("expert");
		System.out.println(visitor.visit(high_renaissance));
		System.out.println(visitor.visit(sculptures));
		System.out.println(visitor.visit(fireplace));
		
		System.out.println("\nThe artlover visit gallery");
		visitor = new ProxyVisitor("artlover");
		System.out.println(visitor.visit(baroque));
		System.out.println(visitor.visit(impressionism));
		
		System.out.println("\nThe teenager visit gallery");
		visitor = new ProxyVisitor("teenager");
		System.out.println(visitor.visit(sculptures2));
		System.out.println(visitor.visit(baroque2));
		System.out.println(visitor.visit(high_renaissance2));
	}
}
