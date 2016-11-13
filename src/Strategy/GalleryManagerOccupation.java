package Strategy;

import Bridge.ManagerControl;
import Bridge.NewCommand;
import Bridge.RemoteControl;
import Command.CreatingBaroqueHall;
import Command.CreatingFireplaceHall;
import Command.CreatingHighRenaissanceHall;
import Command.CreatingImpressionismHall;
import Command.CreatingSculpturesHall;
import Command.Gallery;

/**
 * Concrete user(manager) extended from abstract GalleryAppUser
 * The particular behaviour for this user is defines in the constructor
 * @author Dyachuk Roksolana
 *
 */
public class GalleryManagerOccupation extends GalleryAppUser{

	public GalleryManagerOccupation()
	{
		user_behaviour = new ArrangeGallery();
	}
	
	/**
	 * Uses Bridge pattern implementation for implementing manager`s duties
	 * creates different halls, arrange pictures
	 * shows what pictures are stored in each hall using buttons on the remote control
	 */
	@Override
	public void performOperation() 
	{
		Gallery artgallery = new Gallery();
		CreatingHighRenaissanceHall create_hrhall = new CreatingHighRenaissanceHall(artgallery);
		CreatingBaroqueHall create_bhall = new CreatingBaroqueHall(artgallery);
		CreatingImpressionismHall create_ihall = new CreatingImpressionismHall(artgallery);
		CreatingSculpturesHall create_shall = new CreatingSculpturesHall(artgallery);
		CreatingFireplaceHall create_fhall = new CreatingFireplaceHall(artgallery);
		ManagerControl control = ManagerControl.getControl();
		
		System.out.println("\n_____Implementing commands by the machine______");
		RemoteControl remote = new NewCommand(control, create_hrhall);
		remote.insert(create_bhall);
		remote.insert(create_ihall);
		remote.insert(create_shall);
		remote.insert(create_fhall);
		System.out.println("\n------Arranging High Renaissance Hall");
		remote.executebyNumber(0);
		System.out.println("\n------Arranging Baroque Hall");
		remote.executebyNumber(1);
		System.out.println("\n------Arranging Impressionism Hall");
		remote.executebyNumber(2);
		System.out.println("\n------Arranging Sculptures Hall");
		remote.executebyNumber(3);
		System.out.println("\n------Arranging Fireplace Hall");
		remote.executebyNumber(4);
	}	
}
