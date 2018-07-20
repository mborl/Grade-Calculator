package gradeGUI;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

public class MainMenuBar extends MenuBar {
	
	private Menu file;
	
	public MainMenuBar() {
		
		file = new Menu("File");
		getMenus().add(file);
		
	}
	
}
