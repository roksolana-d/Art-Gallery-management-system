package VisitorProxy;
import java.util.ArrayList;

import Command.Gallery;
import FactoryMethodFlyweight.CezannePainting;
import FactoryMethodFlyweight.DegasPainting;
import FactoryMethodFlyweight.ImpressionismPainting;
import FactoryMethodFlyweight.MonetPainting;
import FactoryMethodFlyweight.PissaroPainting;
import FactoryMethodFlyweight.RenoirPainting;
import FactoryMethodFlyweight.SisleyPainting;

/**
 * Class for collection of paintings as a hall of impressionism style 
 * implements ItemsCollection interface
 * with array list with paintings
 * @author Dyachuk Roksolana
 *
 */
public class ImpressionismCollection implements ItemsCollection{

	ArrayList<ImpressionismPainting> impressionism_hall;
	Gallery gallery;
	public ImpressionismCollection()
	{
		gallery = new Gallery();
		impressionism_hall = new ArrayList<>();
	}

	/**
	 * Accept visitor
	 */
	@Override
	public String accept(GalleryVisitor visitor) 
	{
		return visitor.visit(this);
	}

	/**
	 * Add impressionism paintings to the Array List 
	 * and output them
	 */
	@Override
	public void addItems() 
	{
		impressionism_hall.add(new MonetPainting());
		impressionism_hall.add(new CezannePainting());
		impressionism_hall.add(new DegasPainting());
		impressionism_hall.add(new RenoirPainting());
		impressionism_hall.add(new SisleyPainting());
		impressionism_hall.add(new PissaroPainting());
		
		for(ImpressionismPainting p: impressionism_hall)
		{
			System.out.println(p.toString());
		}
	}
}
