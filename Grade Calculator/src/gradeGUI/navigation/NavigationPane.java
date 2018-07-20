package gradeGUI.navigation;

import javafx.geometry.Orientation;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;

public class NavigationPane extends SplitPane {

	private CoursePane courses;
	private Year_Sem_Pane year_sems;
	
	
	public NavigationPane() {
		
		//instantiate content
		setCourses(new CoursePane());
		setYear_sems(new Year_Sem_Pane());
		
		//put panes into ScrollPanes
		ScrollPane courseScroller = new ScrollPane(courses);
		ScrollPane year_sems_scroller = new ScrollPane(year_sems);
		
		//configure NavigationPane
		setOrientation(Orientation.VERTICAL);
		getItems().addAll(year_sems_scroller, courseScroller);
		setDividerPositions(0.5);
		
	} //close constructor
	
	
	public CoursePane getCourses() {
		
		return courses;
		
	}


	public void setCourses(CoursePane courses) {
		
		courses.setPrefWidth(200);
		this.courses = courses;
		
	}


	public Year_Sem_Pane getYear_sems() {
		
		return year_sems;
		
	}


	public void setYear_sems(Year_Sem_Pane year_sems) {
		
		year_sems.setPrefWidth(200);
		this.year_sems = year_sems;
		
	}

}
