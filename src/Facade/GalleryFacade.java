package Facade;

import java.util.Scanner;

import Strategy.ArrangeGallery;
import Strategy.GalleryManagerOccupation;
import Strategy.GalleryVisitorOccupation;
import Strategy.VisitGallery;

/**
 * User interface which hides functionality from the user
 * @author Dyachuk Roksolana
 *
 */
public class GalleryFacade {
	Scanner scan;
	GalleryManagerOccupation g_manager;
	GalleryVisitorOccupation g_visitor;
	
	public GalleryFacade()
	{
		scan = new Scanner(System.in);
		g_manager = new GalleryManagerOccupation();
		g_visitor = new GalleryVisitorOccupation();
	}
	
	/**
	 * Performs operations by choose of each user type
	 * Visit gallery for user
	 * Arrange gallery for manager
	 */
	public void chooseOccupation()
	{
		while(true)
		{
			System.out.println("Welcome to the Gallery!!");
			System.out.println("Type 1 - if you are a visitor. Type 2 - if you are a manager");
			int input = scan.nextInt();
			
			if(input == 1)
			{
				g_visitor.setUserBehaviour(new VisitGallery());
				g_visitor.performOperation();
			}
			if(input == 2)
			{
				g_manager.setUserBehaviour(new ArrangeGallery());
				g_manager.performOperation();
			}
		}
	}
}
