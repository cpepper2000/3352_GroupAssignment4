package views;

import Controller.controller;
import models.PageElements;

public class ViewPageElements extends models.Observer{

    private models.PageElements pageElements;
    private controllers.Controller controller;

    //one way to do it - other way to have an empty contructor
    public ViewPageElements(models.PageElements pageElements, controllers.Controller controller){

        this.setModel(pageElements);
        this.setController(controller);
    }

    //Inplements update through the observer
    public void update(){

        this.show();
    }

    public void onUpdate(){

        //Logic that collects data from the user
        //then pushes the controller to begin data manipulation on the model
        //classes wihtin the system architechture
        this.controller.updateModel(newInfo);
    }

    //other way to do it is to have an empty controller and have a setter and getter for both of them
    public View(){

    }

    public void show(){
        //display or refresh the view
    }

    public models.PageElements getPageElements(){

        return pageElements;
    }

    public void setModel(models.PageElements model) {

        if (this.model != null){
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attatch(this);
    }


    public controllers.Controller getController() {
        return controller;
    }

    //Attachment of the controller class to the view class so that manipulations can be propgated
    public void setController(controllers.Controller controller) {
        this.controller = controller;
    }
}