package controllers;

import play.*;

import play.data.*;
import play.mvc.*;
import models.*;
import views.html.*;

public class Application extends Controller {
	
	static Form<Task> taskForm = Form.form(Task.class);
	
	public static Result index() {
		return ok(views.html.index.render(Task.all(), taskForm));
	}

	public static Result tasks() {
		return TODO;
	}

	public static Result newTask() {
		return TODO;
	}

	public static Result deleteTask(Long id) {
		return TODO;
	}

}
