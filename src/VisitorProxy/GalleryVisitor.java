package VisitorProxy;

/**
 * Interface for abstract visitor with abstract methods 
 * which accept visitors of different types(for different halls)
 * @author user
 *
 */
public interface GalleryVisitor {

	String visit(HighRenaissanceCollection h_renaissance);
	String visit(BaroqueCollection baroque);
	String visit(ImpressionismCollection impressionism);
	String visit(SculpturesCollection sculptures);
	String visit(FireplaceHall fireplace);
}
