package FactoryMethodFlyweight;

/**
 * Concrete painting by Sisley extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class SisleyPainting extends ImpressionismPainting{

	public SisleyPainting()
	{
		name = "Canal Saint-Martin";
		author = "Alfred Sisley";
		size = "50 * 65 cm";
		creation_year = 1870;
	}
}
