package views;

public class View extends models.Observer{

    private models.Model model;
    private controllers.Controller controller;

    //one way to do it - other way to have an empty contructor
    public View(models.Model model, controllers.Controller controller){

        this.setModel(model);

        this.setController(controller);
    }

    //Inplements update through the observer
    public void update(){

        this.show();
    }

    public void onUpdate(){

        //logic that collects data from the user
        String newInfo = "SE3352 - Requirements Analysis";
        this.controller.updateModel(newInfo);
    }

    //other way to do it is to have an empty controller and have a setter and getter for both of them
    public View(){

    }

    public void show(){
        //display or refresh the view
    }

    public models.Model getModel() {
        return model;
    }

    public void setModel(models.Model model) {

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