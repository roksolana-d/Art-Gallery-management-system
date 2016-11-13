package FactoryMethodFlyweight;

/**
 * Concrete painting by Monet extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class MonetPainting extends ImpressionismPainting{

	public MonetPainting()
	{
		name = "Garden at Sainte-Adresse";
		author = "Claude Monet";
		size = "98.1 * 129.9 cm";
		creation_year = 1867;
	}
}
