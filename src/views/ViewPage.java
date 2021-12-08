package views;

import Controller.controller;
import models.page;

public class ViewPage extends models.Observer{

    private models.Page page;
    private controllers.Controller controller;

    //one way to do it - other way to have an empty contructor
    public ViewPage(models.Page page, controllers.Controller controller){

        this.setModel(page);
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

    public models.Page getPage(){

        return page;
    }

    public void setModel(models.Page model) {

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