package controllers;

import play.*;
import play.mvc.*;

import play.db.jpa.Transactional;

import views.html.*;
import models.Task;

import java.util.*;
public class Application extends Controller {
	
	@Transactional
    public static Result index() {
        return ok(index.render("hello, world.", play.data.Form.form(models.Task.class)));
    }
    public static Result addTask() {
        play.data.Form<models.Task> form = play.data.Form.form(models.Task.class).bindFromRequest();
        if (form.hasErrors()) {
            return badRequest(index.render("hello, world", form));
        }
        else {
            models.Task task = form.get();
            //task.save();
            JPA.em().persist(task);
            return redirect(routes.Application.index());
        }
    }
	public static Result getTasks() {
       List<Task> tasks = new ArrayList();
		//java.util.List<models.Task> tasks = new play.db.ebean.Model.Finder(String.class, models.Task.class).all();
        return ok(play.libs.Json.toJson(tasks));
    }
	
}
