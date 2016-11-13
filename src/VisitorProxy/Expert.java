package VisitorProxy;

/**
 * Concrete Expert visitor for all the halls 
 * who shows his sceptical and detailed impressions about the halls
 * @author Dyachuk Roksolana
 *
 */
public class Expert implements GalleryVisitor{
	
	@Override
	public String visit(HighRenaissanceCollection h_renaissance) 
	{
		System.out.println("\nIn the HighRenaissance hall:");
		h_renaissance.addItems();
		return "Expert: Religious scenes in high renaissance are showed exalted";
	}

	@Override
	public String visit(BaroqueCollection baroque) 
	{
		System.out.println("\nIn the Baroque hall");
		baroque.addItems();
		System.out.println();
		return "Expert: For me baroque is style which can take us to the past. All the paintings are very detailed";
	}

	@Override
	public String visit(ImpressionismCollection impressionism) 
	{
		System.out.println("\nIn the Impressionism hall");
		impressionism.addItems();
		return "Expert: Impressionists are excellent at showing internal vivid emotions";
	}

	@Override
	public String visit(SculpturesCollection sculptures) 
	{
		System.out.println("\nIn the Sculptures hall");
		sculptures.addItems();
		return "Expert: Rodin`s Thinker shows the true meaning of life";
	}

	@Override
	public String visit(FireplaceHall fireplace) 
	{
		System.out.println("\nIn the Fireplace hall");
		fireplace.addItems();
		System.out.println();
		return "Expert: Too many decorations and marble show that this fireplace was owned by some noble men";
	}
}
