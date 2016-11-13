package VisitorProxy;

/**
 * Concrete Proxy visitor for all the halls 
 * who limits acces to the halls and play the role of controller
 * @author Dyachuk Roksolana
 *
 */
public class ProxyVisitor implements GalleryVisitor{
	Expert expert;
	ArtLover artlover;
	RegularTeenager teen;
	String visitor;
	String result = " ";
	
	public ProxyVisitor(String visitor)
	{
		this.visitor = visitor;
	}
	
	@Override
	public String visit(HighRenaissanceCollection h_renaissance) 
	{
		if(visitor.matches("expert"))
		{
			Expert expert = new Expert();
			result = expert.visit(h_renaissance);
		}
		else if(visitor == "artlover")
		{
			ArtLover artlover = new ArtLover();
			result =  artlover.visit(h_renaissance);
		}
		else if(visitor == "teenager")
		{
			RegularTeenager teen = new RegularTeenager();
			result = teen.visit(h_renaissance);
		}
		
		return result;
	}

	@Override
	public String visit(BaroqueCollection baroque) 
	{
		if(visitor == "expert")
		{
			Expert expert = new Expert();
			result = expert.visit(baroque);
		}
		else if(visitor == "artlover")
		{
			ArtLover artlover = new ArtLover();
			result = artlover.visit(baroque);
		}
		else if(visitor == "teenager")
		{
			RegularTeenager teen = new RegularTeenager();
			result = teen.visit(baroque);
		}
		
		return result;
	}

	@Override
	public String visit(ImpressionismCollection impressionism) 
	{
		if(visitor == "expert")
		{
			Expert expert = new Expert();
			result = expert.visit(impressionism);
		}
		else if(visitor == "artlover")
		{
			ArtLover artlover = new ArtLover();
			result = artlover.visit(impressionism);
		}
		else if(visitor == "teenager")
		{
			RegularTeenager teen = new RegularTeenager();
			result = teen.visit(impressionism);
		}
		return result;
	}

	@Override
	public String visit(SculpturesCollection sculptures)
	{
		if(visitor == "expert")
		{
			Expert expert = new Expert();
			result = expert.visit(sculptures);
		}
		else if(visitor == "artlover")
		{
			ArtLover artlover = new ArtLover();
			result = artlover.visit(sculptures);
		}	
		else if(visitor == "teenager")
		{
			result = "Access to the Sculptures hall is limited";
		}
		
		return result;
	}

	@Override
	public String visit(FireplaceHall fireplace) 
	{
		if(visitor == "expert")
		{
			Expert expert = new Expert();
			result = expert.visit(fireplace);
		}
		else if(visitor == "artlover")
		{
			result = "Access to the Fireplace hall is limited";
		}
		else if(visitor == "teenager")
		{
			result = "Access to the Fireplace hall is limited";
		}
		
		return result;
	}

}
