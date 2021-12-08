package models;
import java.util.ArrayList;

//Can attach and detach oberservers from our different object types (comment strings, pages and elements, etc.)
//need multiple model classes so we need observer and subject classes
public abstract class Subject{

    ArrayList <Observer> observers = new ArrayList();

    public void attach(Observer){
        this.observers.add(o);
    }

    public void dettach(Observer){
        this.observers.remove(o);
    }

    public void Notify(){
        for(Observer o ; observers){
            o.update();
        }
    }

}