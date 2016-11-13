package FactoryMethodFlyweight;

/**
 * Concrete painting by Renoir extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class RenoirPainting extends ImpressionismPainting{

	public RenoirPainting()
	{
		name = "Luncheon of the Boating Party";
		author = "Pierre-Auguste Renoir";
		size = "129.9 * 172.7 cm";
		creation_year = 1880;
	}
}
