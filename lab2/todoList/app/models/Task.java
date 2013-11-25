package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable {

	@Id
	private Long id;

	@Required
	private String label, project, priority;	
	
	private boolean isDone = false;

	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		List<Task> listTemp= find.all();
		
		
		Collections.sort(listTemp);
		
		return listTemp;
	}

	public static void create(Task task) {
		task.save();
	}
	
	public static void update(Long id) {
		Task tmp = new Task();
		
		tmp.setDone(true);
		tmp.setLabel(find.ref(id).getLabel());
		tmp.setPriority(find.ref(id).getPriority());
		tmp.setProject(find.ref(id).getProject());
		
		delete(id);
		create(tmp);
		
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}

	public boolean isDone() {
		return isDone;
	}

	public void setDone(boolean isDone) {
		this.isDone = isDone;
	}

	public Long getId() {
		return id;
	}

	@Override
	public int compareTo(Object arg0) {
			
		return (this.getPriority().compareTo(((Task) arg0).getPriority()));
	}
	
	
}
