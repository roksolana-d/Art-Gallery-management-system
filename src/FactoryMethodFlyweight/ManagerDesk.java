package FactoryMethodFlyweight;

public class ManagerDesk {

	SimplePaintingFactory factory;
	
	public ManagerDesk(SimplePaintingFactory factory)
	{
		this.factory = factory;
	}
	
	public ImpressionismPainting orderPainting(String type)
	{
		ImpressionismPainting painting;
		painting = factory.findPainting(type);
		return painting;
	}
}
