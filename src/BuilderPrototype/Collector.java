package BuilderPrototype;

/**
 * Collector class which builds sculpture object step by step
 * Also, can be defines as object generator
 * @author Dyachuk Roksolana
 *
 */
public class Collector {

	public AbstractSculpture collect(AbstractSculptureBuilder builder)
	{
		builder.setName();
		builder.setAuthor();
		builder.setMaterial();
		builder.setHeight();
		builder.setYear();
		return builder.getSculpture();
	}	
}
