package TemplateNullObject;

/**
 * CollectorDesk which collects or generates painting of Baroque style
 * using private reference to abstract BaroquePainting class
 * @author Dyachuk Roksolana
 *
 */
public class CollectorDesk {

	private BaroquePainting b_painting;
	
	public CollectorDesk(BaroquePainting b_painting)
	{
		this.b_painting = b_painting;
	}
	
	/**
	 * Creates painting of Baroque style if it is not Null
	 * If it is null creates Null Object
	 */
	public void collect()
	{
		if(b_painting.isNull() == false)
			b_painting.collect();
		else
			b_painting.collectNull();
	}
	
	/**
	 * Resets painting to be created(collected)
	 * @param b_painting
	 */
	public void changePainting(BaroquePainting b_painting)
	{
		this.b_painting = b_painting;
	}
}
