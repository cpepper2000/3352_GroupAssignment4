package models;

import java.util.ArrayList;
import java.util.List;

public class PageElements{
    List<PageElements> elements = new ArrayList<PageElements>();

    //This is the implementation of the subject abstract class to allow
    //Attachment of observers that show when elemtns are modified
    //And can notify users accordingly 
    public void attach(PageElements newElement){
        this.PageElements.add(newElement);
    }

    /* If fully realized, this method would provide functionality for creating or modifying different types of
    Page element objects, both in terms of the content type they ocntain and the geographic placement of the elements onto a page*/
    public void setElements(List<PageElements> elements) {
        this.elements = elements;
    }

    public List<PageElements> getElements() {
        return elements;
    }

    //Functionality for removing pageElement objects from the data structure of the application
    //This function would likely include a call to the detach function as well prior to removal 
    //(likely after letting subscribers know the removal of an object has occured)
    public void removePageElement(int index){
    }
    
    //If a pageElement is deleted or otherwise hidden from users
    //The attached subject can be removed
    public void dettach(PageElements){
        this.page.remove(Element);
    }


}