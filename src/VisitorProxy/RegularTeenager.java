package VisitorProxy;

/**
 * Concrete RegularTeenager visitor for all the halls 
 * who shows his naive impressions about the halls
 * @author Dyachuk Roksolana
 *
 */
public class RegularTeenager implements GalleryVisitor{

	@Override
	public String visit(HighRenaissanceCollection h_renaissance) 
	{
		System.out.println("\nIn the HighRenaissance hall:");
		h_renaissance.addItems();
		return "RegularTeenager: So funny poses, lol";
	}

	@Override
	public String visit(BaroqueCollection baroque) 
	{
		System.out.println("\nIn the Baroque hall");
		baroque.addItems();
		System.out.println();
		return "RegularTeenager: Boooring";
	}

	@Override
	public String visit(ImpressionismCollection impressionism) 
	{
		System.out.println("\nIn the Impressionism hall");
		impressionism.addItems();
		return "RegularTeenager: Sea pictures are nice";
	}

	@Override
	public String visit(SculpturesCollection sculptures) 
	{
		System.out.println("\nIn the Sculptures hall");
		sculptures.addItems();
		return "RegularTeenager: Jeez, they look so real!";
	}

	@Override
	public String visit(FireplaceHall fireplace) 
	{
		System.out.println("\nIn the Fireplace hall");
		fireplace.addItems();
		System.out.println();
		return "RegularTeenager: But it`s just usual fireplace. Hmm";
	}
}
