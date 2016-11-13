package VisitorProxy;
import java.util.ArrayList;

import TemplateNullObject.BarocciPainting;
import TemplateNullObject.BaroquePainting;
import TemplateNullObject.CaravaggioPainting;
import TemplateNullObject.CarracciPainting;
import TemplateNullObject.VelazquezPainting;
import TemplateNullObject.VermeerPainting;

/**
 * Class for collection of paintings as a hall of baroque style 
 * implements ItemsCollection interface
 * with array list with paintings
 * @author Dyachuk Roksolana
 *
 */
public class BaroqueCollection implements ItemsCollection{
		
	ArrayList<BaroquePainting> baroque_hall;
		
	public BaroqueCollection()
	{
		baroque_hall = new ArrayList<>();
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
	 * Add baroque paintings to the Array List 
	 * and output them
	 */
	@Override
	public void addItems() 
	{
		baroque_hall.add(new BarocciPainting());
		baroque_hall.add(new CarracciPainting());
		baroque_hall.add(new CaravaggioPainting());
		baroque_hall.add(new VermeerPainting());
		baroque_hall.add(new VelazquezPainting());
		
		for(BaroquePainting p: baroque_hall)
		{
			p.collect();
		}
	}

}
