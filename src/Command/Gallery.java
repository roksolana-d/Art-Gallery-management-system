package Command;
import AbstractFactory.AlbertinelliFactory;
import AbstractFactory.BartolomeoFactory;
import AbstractFactory.BronzeFrame;
import AbstractFactory.CoreggioFactory;
import AbstractFactory.GoldenFrame;
import AbstractFactory.PaintingApp;
import AbstractFactory.RafaelFactory;
import AbstractFactory.TizianoFactory;
import BuilderPrototype.AbstractSculpture;
import BuilderPrototype.AbstractSculptureBuilder;
import BuilderPrototype.Collector;
import BuilderPrototype.ConcreteSculpture;
import BuilderPrototype.KanovaBuilder;
import BuilderPrototype.RodinBuilder;
import BuilderPrototype.ValadierBuilder;
import FactoryMethodFlyweight.ImpressionismPainting;
import FactoryMethodFlyweight.ManagerDesk;
import FactoryMethodFlyweight.SimplePaintingFactory;
import Singleton.Fireplace;
import TemplateNullObject.BarocciPainting;
import TemplateNullObject.CaravaggioPainting;
import TemplateNullObject.CarracciPainting;
import TemplateNullObject.CollectorDesk;
import TemplateNullObject.NullPainting;
import TemplateNullObject.VelazquezPainting;
import TemplateNullObject.VermeerPainting;

/**
 * Gallery class defines methods for management of halls 
 * and arranging painting by styles in these halls
 * @author Dyachuk Roksolana
 *
 */
public class Gallery {
	
	/**
	 * Creates painting of Impressionism style using simple factry
	 * and through collector desk
	 * Also, the copy of original painting can be created
	 * without creating of the whole new object
	 * Shows information about all the objects
	 */
	public void createImpressionismHall()
	{
		System.out.println("\n **********Impressionism Hall**********");
		SimplePaintingFactory factory = new SimplePaintingFactory();
		ManagerDesk desk = new ManagerDesk(factory);
		ImpressionismPainting painting = desk.orderPainting("Monet");
		System.out.println(painting.toString());
		painting = desk.orderPainting("Cezanne");
		System.out.println(painting.toString());
		painting = desk.orderPainting("Degas");
		System.out.println(painting.toString());	
		System.out.println("Original is going to be sent to another gallery");
		painting = desk.orderPainting("Renoir");
		System.out.println(painting.toString());
		painting = desk.orderPainting("Pissaro");
		System.out.println(painting.toString());
		painting = desk.orderPainting("Sisley");
		System.out.println(painting.toString());	
		System.out.println("Copy of the original");
		painting = desk.orderPainting("Renoir");
		System.out.println(painting.toString());
	}
	
	/**
	 * Creates painting of Renaissance style using particular factry
	 * and decorators for paintings (frames)
	 * Shows information about all the objects
	 */
	public void createHighRenaissanceHall()
	{
		System.out.println("\n **********High Renaissance Hall**********");
		PaintingApp p_app = new PaintingApp();
		
		p_app.addnewPainting(new RafaelFactory());
		GoldenFrame g_frame = new GoldenFrame(p_app.getPainting());
		System.out.println(g_frame.getDescription());
		System.out.println();
		
		p_app.addnewPainting(new BartolomeoFactory());
		BronzeFrame b_frame = new BronzeFrame(p_app.getPainting());
		System.out.println(b_frame.getDescription());
		System.out.println();
		
		p_app.addnewPainting(new AlbertinelliFactory());
		BronzeFrame b_frame1 = new BronzeFrame(p_app.getPainting());
		System.out.println(b_frame1.getDescription());
		System.out.println();
		
		p_app.addnewPainting(new CoreggioFactory());
		BronzeFrame b_frame2 = new BronzeFrame(p_app.getPainting());
		System.out.println(b_frame2.getDescription());
		System.out.println();
		
		p_app.addnewPainting(new TizianoFactory());
		BronzeFrame g_frame2 = new BronzeFrame(p_app.getPainting());
		System.out.println(g_frame2.getDescription());
		System.out.println();
	}
	
	
	/**
	 * Creates painting of Baroque style using template
	 * and through collector desk
	 * Also, the null painting can be created 
	 * which would be a saved space to a picture to be hang
	 * Shows information about all the objects
	 */
	public void createBaroqueHall()
	{
		System.out.println("\n **********Baroque Hall**********");
		CollectorDesk desk = new CollectorDesk(new VermeerPainting());
		desk.collect();	
		desk.changePainting(new VelazquezPainting());
		desk.collect();	
		desk.changePainting(new BarocciPainting());
		desk.collect();
		desk.changePainting(new CarracciPainting());
		desk.collect();
		desk.changePainting(new CaravaggioPainting());
		desk.collect();
		desk.changePainting(new NullPainting());
		desk.collect();
	}
	
	/**
	 * Creates sculptures using builder and prototype
	 * and through collector desk
	 * Also, the copy of original sculpture can be created
	 * with different parameters that can be resetted manually
	 * Shows information about all the objects
	 */
	public void createSculpturesHall()
	{
		System.out.println("\n **********Sculptures Hall**********");
		AbstractSculpture a_sculpture = new ConcreteSculpture();
		AbstractSculptureBuilder builder = new KanovaBuilder(a_sculpture);
		Collector collector = new Collector();
		
		a_sculpture = collector.collect(builder);
		a_sculpture.getInfo();
		
		builder = new ValadierBuilder(a_sculpture);
		a_sculpture = collector.collect(builder);
		a_sculpture.getInfo();
		
		builder = new RodinBuilder(a_sculpture);
		a_sculpture = collector.collect(builder);	
		a_sculpture.getInfo();
		
		builder.setName("The Kiss");
		builder.setMaterial("marble");
		builder.setHeight(182);
		builder.setYear(1889);
		AbstractSculpture copy_sculpture = (ConcreteSculpture) a_sculpture.clone();
		copy_sculpture.getInfo();
	}
	
	/**
	 * Creates fireplace hall using getInstance() method
	 * Shows information about the object
	 */
	public void createFireplaceHall()
	{
		System.out.println("\n **********Fireplace Hall**********");
		Fireplace fireplace = Fireplace.getInstance();
		fireplace.showInfo();
	}
	
}
