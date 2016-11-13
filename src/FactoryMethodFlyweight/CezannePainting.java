package FactoryMethodFlyweight;

/**
 * Concrete painting by Cezanne extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class CezannePainting extends ImpressionismPainting{

	public CezannePainting()
	{
		name = "The House With The Cracked Walls";
		author = "Paul Cezanne";
		size = "80 * 64.1 cm";
		creation_year = 1894;
	}

	
}
