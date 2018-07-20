package gradeGUI;

import gradeGUI.navigation.NavigationPane;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.BorderPane;


public class PrimaryPane extends BorderPane {

	private CloseUpPane closeUp;
	private MainMenuBar menu;
	private NavigationPane nav;
	
	public PrimaryPane() {

		closeUp = new CloseUpPane();
		menu = new MainMenuBar();
		nav = new NavigationPane();
		
		ScrollPane closeUpScroller = new ScrollPane(closeUp);
		
		setTop(menu);
		setLeft(nav);
		setCenter(closeUpScroller);
		
	}
	
}
