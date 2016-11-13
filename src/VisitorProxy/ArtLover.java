package VisitorProxy;

/**
 * Concrete ArtLover visitor for all the halls 
 * who shows his inspired impressions about the halls
 * @author Dyachuk Roksolana
 *
 */
public class ArtLover implements GalleryVisitor{

	@Override
	public String visit(HighRenaissanceCollection h_renaissance) 
	{
		System.out.println("\nIn the HighRenaissance hall:");
		h_renaissance.addItems();
		return "ArtLover: Astonishing!";
	}

	@Override
	public String visit(BaroqueCollection baroque) 
	{
		System.out.println("\nIn the Baroque hall");
		baroque.addItems();
		System.out.println();
		return "ArtLover: This is luxury!";
	}

	@Override
	public String visit(ImpressionismCollection impressionism) 
	{
		System.out.println("\nIn the Impressionism hall");
		impressionism.addItems();
		return "ArtLover: My favourite Monet is such an inspiration!";
	}

	@Override
	public String visit(SculpturesCollection sculptures) 
	{
		System.out.println("\nIn the Sculptures hall");
		sculptures.addItems();
		return "ArtLover: Rodin`s Thinker leaves such a great impression!";
	}

	@Override
	public String visit(FireplaceHall fireplace) 
	{
		System.out.println("\nIn the Fireplace hall");
		fireplace.addItems();
		System.out.println();
		return "ArtLover: Marvelous work of art!";
	}
}
