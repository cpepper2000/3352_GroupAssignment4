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

    /*In full implementtion, this would contain functionality for the display of commentstrings appended to differenrt parts of
    larger page objects. Data from string contained within the comment string object would be effectively parsed based on split functionality
    or a similar method to allow for stylization of different messages from different users regarding different topics. This would allow
    for the promised functionality of a more rubust commenting framework*/
    public void show(){
        //display or refresh the view
    }

    public models.CommentString getCommentString(){

        return commentString;
    }

    //The set model method in each view class is intended to allow for the selection of the object
    //relevant to the class file. If there is already an objevt selected, it is dropped to prevent multiple update errors


    public void setModel(models.CommentString model) {

        if (this.model != null){
            this.model.dettach(this);
        }

        this.model = model;
        this.model.attatch(this);
    }

    //Called when the model needs to be updated based on user input to the view
    public controllers.Controller getController() {
        return controller;
    }

    //Attachment of the controller class to the view class so that manipulations can be propgated
    public void setController(controllers.Controller controller) {
        this.controller = controller;
    }
}