package gradeGUI.navigation;

public class NavigationPane {

	private CoursePane courses;
	private Year_Sem_Pane year_sems;
	
	
	public NavigationPane() {
		
		setCourses(new CoursePane());
		setYear_sems(new Year_Sem_Pane());
		
	} //close constructor
	
	public CoursePane getCourses() {
		return courses;
	}


	public void setCourses(CoursePane courses) {
		this.courses = courses;
	}


	public Year_Sem_Pane getYear_sems() {
		return year_sems;
	}


	public void setYear_sems(Year_Sem_Pane year_sems) {
		this.year_sems = year_sems;
	}

}
