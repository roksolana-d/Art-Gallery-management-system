package FactoryMethodFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Simple factory that generates object on particular type 
 * based on the given information
 * Uses Hashmap for flyweight pool creation
 * @author Dyachuk Roksolana
 *
 */
public class SimplePaintingFactory {
	
	private Map<String, ImpressionismPainting> flyweightPool = new HashMap<String, ImpressionismPainting>();
	
	/**
	 * Creates impressionism paintings by authors 
	 * If object already exists uses created one
	 * @param type
	 * @return ImpressionismPainting
	 */
	public ImpressionismPainting findPainting(String type)
	{	
		if(flyweightPool.containsKey(type))
		{
			return flyweightPool.get(type);
		}
		else
		{
			ImpressionismPainting painting = null;
			if(type.equals("Monet"))
			{
				painting = new MonetPainting();
			}
			if(type.equals("Cezanne"))
			{
				painting = new CezannePainting();
			}
			if(type.equals("Degas"))
			{
				painting = new DegasPainting();
			}
			if(type.equals("Renoir"))
			{
				painting = new RenoirPainting();
			}
			if(type.equals("Pissaro"))
			{
				painting = new PissaroPainting();
			}
			if(type.equals("Sisley"))
			{
				painting = new SisleyPainting();
			}
			flyweightPool.put(type, painting);
			return painting;
		}
	}
}
