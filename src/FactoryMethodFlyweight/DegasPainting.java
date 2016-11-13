package FactoryMethodFlyweight;

/**
 * Concrete painting by Degas extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class DegasPainting extends ImpressionismPainting{

	public DegasPainting()
	{
		name = "Miss La La at the Cirque Fernando";
		author = "Edgar Degas";
		size = "117.2 * 77.5 cm";
		creation_year = 1879;
	}
}
