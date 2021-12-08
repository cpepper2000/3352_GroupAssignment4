package views;

import Controller.controller;
import models.CommentString;

public class ViewCommentString extends models.Observer{

    private models.CommentString commentString;
    private controllers.Controller controller;

    //one way to do it - other way to have an empty contructor
    public ViewCommentString(models.CommentString commentString, controllers.Controller controller){

        this.setModel(commentString);
        this.setController(controller);
    }

    public void update(){

        this.show();
    }

    public void onUpdate(){

        //logic that collects data from the user
        this.controller.updateModel(newInfo);
    }

    //other way to do it is to have an empty controller and have a setter and getter for both of them
    public View(){

    }

    public void show(){
        //display or refresh the view
    }

    public models.CommentString getCommentString(){

        return commentString;
    }

    public void setModel(models.CommentString model) {

        if (this.model != null){
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attatch(this);
    }

    public controllers.Controller getController() {
        return controller;
    }

    public void setController(controllers.Controller controller) {
        this.controller = controller;
    }
}