package models;

import java.util.ArrayList;
import java.util.List;

public class Page{
    List<Page> page = new ArrayList<Page>();

    //This is the implementation of the subject abstract class to allow
    //Attachment of observers that show when elemtns are modified
    //And can notify users accordingly 
    public void attach(Page newPage){
        this.page.add(newPage);
    }

    //In fully relaized functionality, this would include code that intanstiates a page object
    //which would contain Arraylists to hold various page element objects
    //And would also contain data on the geometric placement of elements on a particulat page
    public void setPage(){

    }

    public List<Page> getPage() {
        return page;
    }

    //If a page is deleted or otherwise hidden from users
    //The attached subject can be removed
    public void dettach(Page){
        this.page.remove(page);
    }


}