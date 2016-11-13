package FactoryMethodFlyweight;

/**
 * Concrete painting by Pissaro extending abstract ImpressionismPainting
 * Defines some data about the painting
 * @author Dyachuk Roksolana
 *
 */
public class PissaroPainting extends ImpressionismPainting{

	public PissaroPainting()
	{
		name = "Le Boulevard de Montmartre, Matinée de Printemps";
		author = "CamillePissaro";
		size = "65 * 81 cm";
		creation_year = 1897;
	}
}
